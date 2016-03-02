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
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application implements CommandLineRunner{
    
    private static final Logger log = LoggerFactory.getLogger(eu.impress.impressplatform.Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Override
    public void run(String... strings) throws Exception {
        String bedavailability;
        String bedavailabilityDE;
        /*RESTManager r = new RESTManager();
        String  s = r.consumePopulation();*/
        BedAvailabilityServiceBean b = new BedAvailabilityServiceBean();
       
        bedavailability=b.getBedAvailablityHAVE("ΛΑΙΚΟ");
        
        bedavailabilityDE=b.createBedAvailabilityDE(bedavailability);
         
        log.info("Current message: "+bedavailabilityDE);
        
       
    }
    
    @PostConstruct
    public void PostConstruct(){
        
        String s;    
    
    }
    
   

 
}