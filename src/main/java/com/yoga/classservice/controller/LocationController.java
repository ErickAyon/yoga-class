package com.yoga.classservice.controller;

import com.yoga.classservice.model.Location;
import com.yoga.classservice.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {
    @Autowired
    LocationService locationService;

    @PostMapping
    public void createLocation(@RequestBody Location location) {
        locationService.createLocation(location);
    }

    @GetMapping
    public List<Location> getLocations() {
        return locationService.getAllLocations();
    }
}
