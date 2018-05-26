package it.polito.tdp.flight.model;

import java.util.HashMap;
import java.util.Map;


public class RouteIdMap {
	
private Map<Integer, Route> map;
//la chiave primaria della route è la combinazione di tre chiavi
//allora creiamo noi un identificativo che aggiungiamo alla classe route e che useremo nella idMap

	public RouteIdMap() {
		
		map = new HashMap<>();
	}
	
	public Route get(int routeId) {
		return map.get(routeId);
	}
	
	public Route get(Route route) {
		Route old = map.get(route.getRouteId());
		if (old == null) {
			map.put(route.getRouteId(), route);
			return route;
		}
		return old;
	}

public void put(Route route, int routeId) {
	map.put(routeId, route);
}
}

