package eu.impress.impressplatform.Services.DHC;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eu.impress.impressplatform.IntegrationLayer.ResourcesMgmt.PopulationService;
import eu.impress.impressplatform.Models.DHC.Building;
import eu.impress.impressplatform.Models.DHC.CityStats;
import eu.impress.impressplatform.Models.DHC.GeoPoint;
import eu.impress.impressplatform.repository.DHC.PopulationQueryEngine;

@RestController
public class PopulationQueryController {
	
	@Autowired
	private PopulationService populationService;
	
	@RequestMapping(
			value="/population/city/{cityName}", 
			method=RequestMethod.GET,
			produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<CityStats> getCityPopulation(@PathVariable("cityName") String cityName) {	
		CityStats cityStats = populationService.getCityPopulation(cityName);
		return new ResponseEntity<CityStats>(cityStats, HttpStatus.OK);
	}
	@RequestMapping(
			value="/population/point", 
			method=RequestMethod.GET,
			produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<CityStats> 
	getPointPopulation(@RequestParam("lat") String lat, @RequestParam("long") String lng) {	
		CityStats cityStats = populationService.getPointPopulation(lat, lng);
		return new ResponseEntity<CityStats>(cityStats, HttpStatus.OK);
	}	
	@RequestMapping(
			value="/population/area", 
			method=RequestMethod.GET,
			produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Collection<CityStats>> 
	getPointPopulation(
			@RequestParam("lat1") String lat1, @RequestParam("long1") String lng1,
			@RequestParam("lat2") String lat2, @RequestParam("long2") String lng2,
			@RequestParam("lat3") String lat3, @RequestParam("long3") String lng3,
			@RequestParam("lat4") String lat4, @RequestParam("long4") String lng4) {	
		List<GeoPoint> points = new ArrayList<GeoPoint>();
		points.add(new GeoPoint(lat1,lng1));
		points.add(new GeoPoint(lat2,lng2));
		points.add(new GeoPoint(lat3,lng3));
		points.add(new GeoPoint(lat4,lng4));
		Collection<CityStats> cityStats = populationService.getAreaPopulation(points);
		return new ResponseEntity<Collection<CityStats>>(cityStats, HttpStatus.OK);
	}	
	@RequestMapping(
			value="/poi", 
			method=RequestMethod.GET,
			produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Collection<Building>> 
	getAreaBuilding(
			@RequestParam("type") String type,
			@RequestParam("lat1") String lat1, @RequestParam("long1") String lng1,
			@RequestParam("lat2") String lat2, @RequestParam("long2") String lng2,
			@RequestParam("lat3") String lat3, @RequestParam("long3") String lng3,
			@RequestParam("lat4") String lat4, @RequestParam("long4") String lng4) {	
		List<GeoPoint> points = new ArrayList<GeoPoint>();
		points.add(new GeoPoint(lat1,lng1));
		points.add(new GeoPoint(lat2,lng2));
		points.add(new GeoPoint(lat3,lng3));
		points.add(new GeoPoint(lat4,lng4));
		Collection<Building> cityStats = populationService.getAreaBuildings(points, type);
		return new ResponseEntity<Collection<Building>>(cityStats, HttpStatus.OK);
	}		
}
