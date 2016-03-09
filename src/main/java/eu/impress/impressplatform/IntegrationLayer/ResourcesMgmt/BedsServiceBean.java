package eu.impress.impressplatform.IntegrationLayer.ResourcesMgmt;


import eu.impress.impressplatform.Models.DHC.BedStats;
import eu.impress.impressplatform.repository.DHC.BedsQueryEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BedsServiceBean implements BedsService {

	@Autowired
	private BedsQueryEngine bedsQueryEngine;
	
	@Override
	public BedStats getClinicAvailableBeds(Integer clinicId) {
		BedStats bedStats = bedsQueryEngine.findAvailableBedsByClinic(clinicId);
		return bedStats;
	}

	@Override
	public BedStats getHospitalAvailableBeds(String hospitalName) {
		BedStats bedStats = bedsQueryEngine.findHospitalAvailableBedsAllClinics(hospitalName);
		return bedStats;
	}

}
