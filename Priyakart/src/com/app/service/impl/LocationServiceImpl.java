package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILocationDao;
import com.app.model.Location;
import com.app.service.ILocationService;

@Service
public class LocationServiceImpl implements ILocationService{
	@Autowired
	private ILocationDao dao;
	
	@Override
	public List<Location> getAllLocations() {
		return dao.getAllLocations();
	}
	@Override
	public Location getLocationById(int locId) {
		return dao.getLocationById(locId);
	}
}
