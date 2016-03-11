package eu.impress.impressplatform.IntegrationLayer.ResourcesMgmt;

import java.util.Collection;
import java.util.List;

import eu.impress.impressplatform.Models.DHC.Building;
import eu.impress.impressplatform.Models.DHC.CityStats;
import eu.impress.impressplatform.Models.DHC.GeoPoint;

public interface PopulationService {
	CityStats getCityPopulation(String city);
	CityStats getPointPopulation(String lat, String lng);
	Collection<CityStats> getAreaPopulation(List<GeoPoint> points);
	Collection<Building> getAreaBuildings(List<GeoPoint> points, String type);
}
