package it.polito.tdp.flight.model;

import java.util.ArrayList;
import java.util.List;

import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import it.polito.tdp.flight.db.FlightDAO;

public class Model {

	
	private FlightDAO fDao=null; 

	//private SimpleDirectedWeightedGraph<Airport, > g;
	
	
	//creo le idMap per le liste
	List<Airline> airlines;
	List<Airport> airports;
	List<Route> routes;
	
	AirlineIdMap airlineIdMap;
	AirportIdMap airportIdMap;
	RouteIdMap routeIdMap;
	
	
	
	public Model() {
		fDao = new FlightDAO();
		
		//le idMap si inizializzano prima delle liste
		airlineIdMap = new AirlineIdMap();
		airportIdMap = new AirportIdMap();
		routeIdMap = new RouteIdMap();
		
		
		System.out.println("++++++");
		 airlines = fDao.getAllAirlines(airlineIdMap);
		System.out.println(airlines);

		
		
		
		 airports = fDao.getAllAirports(airportIdMap);
		 System.out.println(airports);
	

		 //devo passargli anche le altre idMap poichè deve creare collegamenti incrociati
		 routes = fDao.getAllRoutes(airlineIdMap, airportIdMap, routeIdMap);
		 System.out.println(routes);
	
		
		
		
		
	}
	
	

	
	
}
