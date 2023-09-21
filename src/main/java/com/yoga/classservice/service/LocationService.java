package com.yoga.classservice.service;

import com.yoga.classservice.model.Location;
import com.yoga.classservice.model.Student;
import com.yoga.classservice.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LocationService {

    @Autowired
    LocationRepository locationRepository;

    public void createLocation(Location location) {
        locationRepository.save(location);
    }

    public List<Location> getAllLocations() {
        List<Location> locations = new ArrayList<>();
        locationRepository.findAll().forEach((n)->locations.add(n));
        return locations;
    }
}
