package com.yoga.classservice.model.requestwrapper;


public class EventCreationRequest {
    private String name;
    private Long locationId;
    private Long teacherId;

    public EventCreationRequest(String name, Long locationId, Long teacherId) {
        this.name = name;
        this.locationId = locationId;
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
