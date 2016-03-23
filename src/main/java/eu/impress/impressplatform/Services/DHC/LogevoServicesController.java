package eu.impress.impressplatform.Services.DHC;

//import org.impress.datahomogenization.ws.external.clients.LogevoClient;
//import org.impress.datahomogenization.ws.model.logevo.LogEvoResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eu.impress.impressplatform.IntegrationLayer.ResourcesMgmt.LogevoService;
import eu.impress.impressplatform.Models.DHC.LogevoAssetLevel;

@RestController
public class LogevoServicesController  {
	@Autowired
	private LogevoService logevoService;
	
	@RequestMapping(
			value="/logevo/assetlevel",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE			
	)
	public ResponseEntity<LogevoAssetLevel> getAssetLevel(
		@RequestParam("num_patients") Integer numPatients,
		@RequestParam("hospital_type") String hospitalType,
		@RequestParam("resource_ID") String resourceID,
		@RequestParam(value="asset_level_init", required=false) Float assetLevelInit,
		@RequestParam("delta_T") Integer deltaT) {
		
		//LogEvoResults logevoResults = logevoClient.getLogevoResults(0, "", "", 1, 1);
		//logevoClient.test();
		//return new ResponseEntity<LogevoAssetLevel>(
		//		logevoService.getLogevoAssetLevel(numPatients, hospitalType, resourceID, assetLevelInit, deltaT), HttpStatus.OK);
		return new ResponseEntity<LogevoAssetLevel>(
				logevoService.getLogevoAssetLevel(600, hospitalType, resourceID, assetLevelInit, 12), HttpStatus.OK);		
	}
}
