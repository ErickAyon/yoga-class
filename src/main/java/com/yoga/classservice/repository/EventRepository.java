package com.yoga.classservice.repository;

import com.yoga.classservice.model.Event;
import com.yoga.classservice.model.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long> {
    public List<Event> getAllByLocationEquals(Location location);
}
