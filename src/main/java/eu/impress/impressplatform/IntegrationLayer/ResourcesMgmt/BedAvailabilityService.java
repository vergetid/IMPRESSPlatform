/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.impress.impressplatform.IntegrationLayer.ResourcesMgmt;

import javax.xml.datatype.DatatypeConfigurationException;

/**
 *
 * @author danae
 */
public interface BedAvailabilityService {
    
    public String getBedAvailablityHAVE(String hospitalname);
    public String createBedAvailabilityDE(String edxlhave) throws DatatypeConfigurationException;
    public String forwardBedAvailability(String EDXLDEmessage);   
    
}
