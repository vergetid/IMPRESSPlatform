package eu.impress.impressplatform.IntegrationLayer.ResourcesMgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.impress.impressplatform.Models.DHC.LogevoAssetLevel;
import eu.impress.impressplatform.repository.DHC.LogevoQueryEngine;

@Service
public class LogevoServiceBean implements LogevoService {

	@Autowired 
	private LogevoQueryEngine logevoQueryEngine;
	
	@Override
	public LogevoAssetLevel getLogevoAssetLevel(Integer numPatients, String hospitalType, String resourceID,
			Float assetLevelInit, Integer deltaT) {
		//return 
		return logevoQueryEngine.getLogevoAssetLevel(numPatients, hospitalType, resourceID,
				assetLevelInit, deltaT);
	}

}
