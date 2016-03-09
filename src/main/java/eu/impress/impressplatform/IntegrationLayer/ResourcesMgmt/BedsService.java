package eu.impress.impressplatform.IntegrationLayer.ResourcesMgmt;

import eu.impress.impressplatform.Models.DHC.BedStats;



public interface BedsService {
	BedStats getClinicAvailableBeds(Integer clinicId);
	BedStats getHospitalAvailableBeds(String hospitalName);
}
