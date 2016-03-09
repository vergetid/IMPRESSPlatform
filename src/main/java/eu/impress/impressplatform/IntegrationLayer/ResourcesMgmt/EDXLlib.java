/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.impress.impressplatform.IntegrationLayer.ResourcesMgmt;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import oasis.names.tc.emergency.EDXL.DE._1.*;
import oasis.names.tc.emergency.edxl.have._1.HospitalStatus;
import oasis.names.tc.emergency.edxl.have._1.HospitalStatus.Hospital;

/**
 *
 * @author danae
 */
public class EDXLlib {
    
    //constructs EDXLDEmessage
    public static String DEEncapsulation(String DEString, String EDXLHave) throws DatatypeConfigurationException{
        
        //String EDXLHaveplain = EDXLHave.replace("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>", "");
        //String finalDEString = DEString.replace("<xmlContent/>", "<xmlContent>"+EDXLHaveplain+"<xmlContent/>").replace("\"", "\\\"");
        String finalDEString = DEString.replace("<xmlContent/>", "<xmlContent>"+EDXLHave+"</xmlContent>");
        return finalDEString;
    
    }
    
    /*
    Creates the EDXL-DE envelope with empty EmbeddedXMLContent
    */
    public static EDXLDistribution createEDXLEnvelope() throws DatatypeConfigurationException{
        
        List<String> country = new ArrayList<String>();
        List<TargetAreaType> targetArea = new ArrayList<TargetAreaType>();
        TargetAreaType tatype = new TargetAreaType();
        
        List<ValueSchemeType> explicitAddress = new ArrayList<ValueSchemeType>();
        ValueSchemeType vstype = new ValueSchemeType();
        List<String> explicitAddressValue = new ArrayList<String>();
        
        List<ContentObjectType> contentObject = new ArrayList<ContentObjectType>();
        ContentObjectType ct = new ContentObjectType();
        XmlContentType xt = new XmlContentType();
        
        String uuid = UUID.randomUUID().toString();
        
        //String EDXLHaveplain = EDXLHave.replace("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>", "");
        //List<AnyXMLType> embeddedXMLContent = new ArrayList<AnyXMLType>();
        //List<HospitalStatusType> embeddedXMLContent = new ArrayList<HospitalStatusType>();
        //HospitalStatus hospitalstatus = new HospitalStatus();
       
        //AnyXMLType any = new AnyXMLType();
        //HospitalStatusType hst = new HospitalStatusType();
        //List<HospitalStatus> anycontent = new ArrayList<HospitalStatus>();
              
        
        EDXLDistribution ed = new EDXLDistribution();
        ed.setDistributionID("impress_dhc_"+uuid); //this must be defined
        ed.setSenderID("urn://impress/dhc/bedavailability");
        
        country.add("GR");
        tatype.setCountry(country);
        targetArea.add(tatype);
        ed.setTargetArea(targetArea);
        
        ed.setDateTimeSent(getXMLGregorianCalendar());
        ed.setDistributionStatus(StatusValues.ACTUAL);
        ed.setDistributionType(TypeValues.REPORT);
        ed.setCombinedConfidentiality("Unclassified");
        
        vstype.setExplicitAddressScheme("urn");
        explicitAddressValue.add("urn://agency/keelpno");
        vstype.setExplicitAddressValue(explicitAddressValue);
        explicitAddress.add(vstype);
        ed.setExplicitAddress(explicitAddress);
        
        
        /*anycontent.add(hstatus);        
        any.setAny(anycontent);
        embeddedXMLContent.add(any);*/
        //hst.setHospitalStatus(hstatus);
       // embeddedXMLContent.add(hst);
        //xt.setEmbeddedXMLContent(embeddedXMLContent);
        //xt.setEmbeddedXMLContent(hstatus);
        //xt.setEmbeddedXMLContent(EDXLHaveplain);
        xt.setEmbeddedXMLContent(null);
        ct.setXmlContent(xt);
        contentObject.add(ct);
        ed.setContentObject(contentObject);
        
        return ed; 
    
    
    }
    
    public static XMLGregorianCalendar getXMLGregorianCalendar() throws DatatypeConfigurationException {

        try {

            Date now = new Date();
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(now);
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            return date2;

        } catch (DatatypeConfigurationException c) {

            return null;

        }

    }

    
    /*public static String getCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");//dd/MM/yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }*/
    
}
