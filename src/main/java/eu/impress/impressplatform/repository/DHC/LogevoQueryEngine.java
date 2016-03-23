package eu.impress.impressplatform.repository.DHC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import eu.impress.impressplatform.Models.DHC.LogevoAssetLevel;

@Repository
public class LogevoQueryEngine {

	private Integer hospitalTypePos;
	private Integer resourceIDPos;
	
	public LogevoAssetLevel getLogevoAssetLevel(Integer numPatients, String hospitalType, String resourceID,
			Float assetLevelInit, Integer deltaT) {
		LogevoAssetLevel logevoAssetLevel = new LogevoAssetLevel();
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            String url = "http://biomat1.iasi.cnr.it/webservices/IMPRESS/services.php";
            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(
            		numPatients,hospitalType,resourceID,assetLevelInit,deltaT), url);

            // Process the SOAP Response
            printSOAPResponse(soapResponse);
            logevoAssetLevel.setAssetLevel(soapResponse.getSOAPBody()
            		.getElementsByTagName("ht_asset_level").item(0).getTextContent());
            soapConnection.close();
        } catch (Exception e) {
            System.err.println("Error occurred while sending SOAP Request to Server");
            e.printStackTrace();
        }	    
		
		return logevoAssetLevel;
		
	}
    private SOAPMessage createSOAPRequest(Integer numPatients, String hospitalType, String resourceID,
			Float assetLevelInit, Integer deltaT) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String serverURI = "http://biomat1.iasi.cnr.it/webservices/IMPRESS/services.php";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("imp", "http://biomat1.iasi.cnr.it/webservices/IMPRESS/");

        /*
        Constructed SOAP Request Message:
        <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:example="http://ws.cdyne.com/">
            <SOAP-ENV:Header/>
            <SOAP-ENV:Body>
                <example:VerifyEmail>
                    <example:email>mutantninja@gmail.com</example:email>
                    <example:LicenseKey>123</example:LicenseKey>
                </example:VerifyEmail>
            </SOAP-ENV:Body>
        </SOAP-ENV:Envelope>
         */

        //DEBUG;
        findAssetLevel(hospitalType, resourceID);
        // SOAP Body        
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("logEvo_Parameters", "imp");
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("num_patients");
        soapBodyElem1.addTextNode(numPatients.toString());
        SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("hospital_type");
        soapBodyElem2.addTextNode(this.hospitalTypePos.toString());
        SOAPElement soapBodyElem3 = soapBodyElem.addChildElement("resource_ID");
        soapBodyElem3.addTextNode(this.resourceIDPos.toString());
        SOAPElement soapBodyElem4 = soapBodyElem.addChildElement("asset_level_init");
        if (assetLevelInit == null) {
        	soapBodyElem4.addTextNode(findAssetLevel
        			(hospitalType,resourceID).toString());
        } else {
        	soapBodyElem4.addTextNode(assetLevelInit.toString());
        }
        SOAPElement soapBodyElem5 = soapBodyElem.addChildElement("delta_T");
        soapBodyElem5.addTextNode(deltaT.toString());        
        
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", serverURI);

        soapMessage.saveChanges();

        /* Print the request message */
        System.out.print("Request SOAP Message = ");
        soapMessage.writeTo(System.out);
        System.out.println();

        return soapMessage;
    }
    
    private static void printSOAPResponse(SOAPMessage soapResponse) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        Source sourceContent = soapResponse.getSOAPPart().getContent();
        System.out.print("\nResponse SOAP Message = ");
        StreamResult result = new StreamResult(System.out);
        transformer.transform(sourceContent, result);
    }
    
    private Float findAssetLevel(String hospitalType, String resourceID) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext();
		org.springframework.core.io.Resource resource = appContext.getResource(
				"classpath:logevoData/logevoInitAssetLevels.csv");
		//find hospitalType column
		int column = 0;
		int row = 0;
		try {
			  InputStream is = resource.getInputStream();
	          BufferedReader br = new BufferedReader(new InputStreamReader(is));
	        	
	          String line = br.readLine();
	          String toks[] = line.split(",");
	          for (int i = 0; i < toks.length; i++) {
	        	  if (purgeString(toks[i]).contains(purgeString(hospitalType))) {
	        		  column = i;
	        		  this.hospitalTypePos = i;
	        		  break;
	        	  }
	          }

	          br.close();			
		} catch (IOException e1) {			
			e1.printStackTrace();
		}
		//find resourceID row
		try {
			  InputStream is = resource.getInputStream();
	          BufferedReader br = new BufferedReader(new InputStreamReader(is));
	        	
	          String line;
	          int i = 0;
	          while ((line = br.readLine()) != null) {
	             String resourceStr = line.split(",")[0];
	             if (purgeString(resourceStr).contains(purgeString(resourceID))) {
	            	 row = i;
	            	 this.resourceIDPos = i;
	            	 break;
	             }
	             i++;
	       	  } 

	          br.close();			
		} catch (IOException e1) {			
			e1.printStackTrace();
		}
		//DEBUG
		System.out.println("Column: " + column + " Row: " + row);
		//find the asset level
		String assetLevel = "";
		try {
			  InputStream is = resource.getInputStream();
	          BufferedReader br = new BufferedReader(new InputStreamReader(is));
	        	
	          String line;	          
	          for (int i = 0;;i++) {
	        	  line = br.readLine();
	        	  if (i == row) {	        		  
	        		  assetLevel = line.split(",")[column];
	        		  break;
	        	  }	        	  
	        	  
	          }

	          br.close();			
		} catch (IOException e1) {			
			e1.printStackTrace();
		}		
    	return Float.parseFloat(assetLevel);
    }
    private String purgeString(String s) {
    	return s.toLowerCase().replace(" ", "").replace("(", "")
    			.replace(")", "").replace("&", "")
    			.replace("&", "").replace(".n","");
    }
}
