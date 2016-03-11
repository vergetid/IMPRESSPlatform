package eu.impress.impressplatform.IntegrationLayer.ResourcesMgmt;

import eu.impress.impressplatform.Models.DHC.LogevoAssetLevel;

public interface LogevoService {
	LogevoAssetLevel getLogevoAssetLevel(
				Integer numPatients,
				String hospitalType,
				String resourceID,
				Integer assetLevelInit,
				Integer deltaT				
	);
}
