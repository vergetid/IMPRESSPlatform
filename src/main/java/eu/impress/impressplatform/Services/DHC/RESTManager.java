/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.impress.impressplatform.Services.DHC;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


/**
 *
 * @author danae
 */

@RestController
@EnableAutoConfiguration
public class RESTManager {
    
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    
    /*public static void main(String[] args) throws Exception {
        SpringApplication.run(RESTManager.class, args);
    }*/
    //rest client for Population
    public String consumePopulation(){
        
        RestTemplate restTemplate = new RestTemplate();
        String s = restTemplate.getForObject("http://192.168.3.27:8080/population/city/Abenbury", String.class);
        return s;

    
    
    }
   

    
    
    
}
