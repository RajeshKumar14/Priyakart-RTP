package com.app.dao;

import java.util.List;

import com.app.model.Location;

public interface ILocationDao {
	
	public List<Location> getAllLocations();
	public Location getLocationById(int locId);
}
