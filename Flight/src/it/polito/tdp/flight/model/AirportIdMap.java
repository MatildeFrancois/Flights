package it.polito.tdp.flight.model;

import java.util.HashMap;
import java.util.Map;


public class AirportIdMap {
	
private Map<Integer, Airport> map;
	
	public AirportIdMap() {
		
		map = new HashMap<>();
	}
	
	
	public Airport get(int airportId) {
		return map.get(airportId);
	}
	
public Airport get(Airport airport) {
		
		//prendo un country dalla mappa
		Airport old = map.get(airport.getAirportId());
		//verifico se esiste
		if(old==null) {
			//nella mappa non c'è questo corso quindi lo devo aggiungere
			map.put(airport.getAirportId(), airport);
			return airport;
		}else {
			//ho gia inserito nella mappa quel corso relativo al codice di insegnamento
			//e non voglio creare un duplicato
			return old; 
		}
		
	}

public void put (int airportId, Airport airport) {
	map.put(airportId, airport);
}
}

