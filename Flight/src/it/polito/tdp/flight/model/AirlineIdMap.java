package it.polito.tdp.flight.model;

import java.util.HashMap;
import java.util.Map;


public class AirlineIdMap {

private Map<Integer, Airline> map;
	
	public AirlineIdMap() {
		
		map = new HashMap<>();
	}
	

	public Airline get (int airlineId) {
		return map.get(airlineId);
	}
	
	
public Airline get(Airline airline) {
		
		//prendo un country dalla mappa
		Airline old = map.get(airline.getAirlineId());
		//verifico se esiste
		if(old==null) {
			//nella mappa non c'è questo corso quindi lo devo aggiungere
			map.put(airline.getAirlineId(), airline);
			return airline;
		}else {
			//ho gia inserito nella mappa quel corso relativo al codice di insegnamento
			//e non voglio creare un duplicato
			return old; 
		}
		
	}

public void put (int airlineId, Airline airline) {
	map.put(airlineId, airline);
}
}
	
	
	
	

