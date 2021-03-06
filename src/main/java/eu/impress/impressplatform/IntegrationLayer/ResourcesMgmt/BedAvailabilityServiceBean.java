/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.impress.impressplatform.IntegrationLayer.ResourcesMgmt;

import eu.impress.impressplatform.Models.DHC.BedStats;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import oasis.names.tc.emergency.EDXL.DE._1.EDXLDistribution;
import oasis.names.tc.emergency.edxl.have._1.HospitalStatus;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
/**
 *
 * @author danae
 */
@Component
public class BedAvailabilityServiceBean implements BedAvailabilityService{
    
    @Value("${connections.dhc.services.host}")
    private String dhchost;

    @Autowired
    private BedsService bedService;
    @Autowired
    private BeansTransformation beansTransformation;
    
    private static final Logger log = LoggerFactory.getLogger(eu.impress.impressplatform.Application.class);
    
    @Override
    public String getBedAvailablityHAVE(String hospitalname){
        
        String hospitalstatushave;
        BedStats bedStats = bedService.getHospitalAvailableBeds(hospitalname);
        HospitalStatus hospitalStatus = beansTransformation.BedStatstoHAVE(bedStats);
        
        
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(HospitalStatus.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            //jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            StringWriter sw = new StringWriter();
            //marshal the envelope 
            jaxbMarshaller.marshal(hospitalStatus, sw);
            hospitalstatushave = sw.toString();

        } catch (JAXBException e) {
            e.printStackTrace();
            return "Error Marshalling XML Object"+HttpStatus.INTERNAL_SERVER_ERROR;
        }

        return hospitalstatushave;

    }
    
    @Override
    public String getBedAvailablityHAVEREST(String hospitalname){
        
        //consume DHC rest service
        RestTemplate restTemplate = new RestTemplate();
        
        
        String s = restTemplate.getForObject(dhchost+"beds/available?hospital="+hospitalname, String.class);
        log.info("URL query: "+dhchost+"beds/available?hospital="+hospitalname);

        //return EDXL-HAVE
        return s;        
    }
    
    @Override
    public String createBedAvailabilityDE() throws DatatypeConfigurationException{
        
        String DEmessageenvelope="";
        String DEmessage="";
        
        EDXLDistribution ed = EDXLlib.createEDXLEnvelope();

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(EDXLDistribution.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            //jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            StringWriter sw = new StringWriter();
            //marshal the envelope 
            jaxbMarshaller.marshal(ed, sw);
            DEmessageenvelope = sw.toString();
            
            //could not unescape characters no matter what!
            //encapsulate the edxl have message into DE by avoiding jaxb 
            //DEmessage = EDXLlib.DEEncapsulation(DEmessageenvelope, edxlhave);
            DEmessage = DEmessageenvelope;

        } catch (JAXBException e) {
            e.printStackTrace();
            return "Error Marshalling XML Object"+HttpStatus.INTERNAL_SERVER_ERROR;
        }

        return DEmessage;

    }
    
    @Override
    public String getBedAvailabilityEDXLDE(String edxlde, String edxlhave) throws DatatypeConfigurationException{
        
        return EDXLlib.DEEncapsulation(edxlde, edxlhave);
    
    }

    @Override
    public String forwardBedAvailability(String DEmessage){
        
        JSONObject message = new JSONObject();
        JSONObject content = new JSONObject();
        
        message.put("message", content);
        message.put("token", "30ac0b41-10e2-4ae3-af32-64c453831eee");
        
        content.put("content", DEmessage);
        
        return message.toString().replace("\\/", "/");
    
    }
    
    
    
//add this cahnges to marshaller in order to unescape charasters
    //import com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler;
    
    //jaxbMarshaller.setProperty("jaxb.encoding", "Unicode");
    //jaxbMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "utf-8");
    //CharacterEscapeHandler escapeHandler = new JaxbCharacterEscapeHandler();
    //jaxbMarshaller.setProperty(CharacterEscapeHandler.class.getName(), escapeHandler);
    
    /*class JaxbCharacterEscapeHandler implements CharacterEscapeHandler {

        public void escape(char[] buf, int start, int len, boolean isAttValue, Writer out) throws IOException {
            for (int i = start; i < start + len; i++) {
                char ch = buf[i];
                out.write(ch);
            }
        }

}*/
    
}
