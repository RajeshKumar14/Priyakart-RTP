package com.app.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.dao.ILocationDao;
import com.app.model.Location;

@Repository
public class LocationDaoImpl implements ILocationDao{
	@Override
	public List<Location> getAllLocations() {
		return null;
	}
	
	@Override
	public Location getLocationById(int locId) {
		return null;
	}
	
}
