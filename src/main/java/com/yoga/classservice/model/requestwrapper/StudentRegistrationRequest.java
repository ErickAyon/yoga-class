package com.yoga.classservice.model.requestwrapper;

public class StudentRegistrationRequest {
    Long eventId;
    Long studentId;

    public StudentRegistrationRequest(Long eventId, Long studentId) {
        this.eventId = eventId;
        this.studentId = studentId;
    }
}
