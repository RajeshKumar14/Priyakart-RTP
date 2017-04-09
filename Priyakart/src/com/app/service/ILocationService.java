package com.app.service;

import java.util.List;

import com.app.model.Location;

public interface ILocationService {
	
	public List<Location> getAllLocations();
	public Location getLocationById(int locId);
	
}
