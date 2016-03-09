package eu.impress.impressplatform.IntegrationLayer.ResourcesMgmt;


import eu.impress.impressplatform.Models.DHC.BedStats;
import oasis.names.tc.emergency.edxl.have._1.HospitalStatus;

public interface BeansTransformation {
	public HospitalStatus BedStatstoHAVE(BedStats bedstats);
}
