package eu.impress.impressplatform.IntegrationLayer.ResourcesMgmt;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.impress.impressplatform.Models.DHC.Building;
import eu.impress.impressplatform.Models.DHC.CityStats;
import eu.impress.impressplatform.Models.DHC.GeoPoint;
import eu.impress.impressplatform.repository.DHC.PopulationQueryEngine;

@Service
public class PopulationServiceBean implements PopulationService {

	@Autowired
	private PopulationQueryEngine populationQueryEngine;
	
	@Override
	public CityStats getCityPopulation(String city) {
		CityStats cityStats = populationQueryEngine.findCityPopulation(city);
		return cityStats;
	}
	@Override
	public CityStats getPointPopulation(String lat, String lng) {
		CityStats cityStats = populationQueryEngine.findPointPopulation(lat, lng);
		return cityStats;
	}
	@Override
	public Collection<CityStats> getAreaPopulation(List<GeoPoint> points) {
		Collection<CityStats> cityStats = populationQueryEngine.findAreaPopulation(points);
		return cityStats;
	}
	@Override
	public Collection<Building> getAreaBuildings(List<GeoPoint> points, String type) {
		Collection<Building> buildings = populationQueryEngine.findAreaBuildings(points, type);
		return buildings;
	}

}
