/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.impress.impressplatform;

/**
 *
 * @author danae
 */
import eu.impress.impressplatform.IntegrationLayer.ResourcesMgmt.*;
import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


//@ComponentScan({"eu.impress.impressplatform"})
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application implements CommandLineRunner{
    
    @Autowired
    BedAvailabilityServiceBean b;
    
    @Value("${connections.incimag.emcr.endpoint.message}")
    private String EMCRUrl;
    
    private static final Logger log = LoggerFactory.getLogger(eu.impress.impressplatform.Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Override
    public void run(String... strings) throws Exception {
        String bedavailability;
        String bedavailabilityDEEnvelope;
        String bedavailabilityDE;
        String bedavailabilityJSON;
        /*RESTManager r = new RESTManager();
         String  s = r.consumePopulation();*/
        
        //get HAVE String
        bedavailability = b.getBedAvailablityHAVE("ΛΑΙΚΟ");
        
        //get DE String
        bedavailabilityDEEnvelope = b.createBedAvailabilityDE();
        
        //encapsulate in DE
        bedavailabilityDE = b.getBedAvailabilityEDXLDE(bedavailabilityDEEnvelope, bedavailability);
        
        //produce json message
        bedavailabilityJSON = b.forwardBedAvailability(bedavailabilityDE);
        log.info("Json message: " + bedavailabilityJSON);
        
        //push message to EMCR
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<String>(bedavailabilityJSON ,headers);
        String answer = restTemplate.postForObject(EMCRUrl, entity, String.class);


        log.info("EMCR response: " + answer);
        //log.info("Current message: " + bedavailabilityJSON);        
       

    }
    
    @PostConstruct
    public void PostConstruct(){
        
        String s;    
    
    }
    
   

 
}