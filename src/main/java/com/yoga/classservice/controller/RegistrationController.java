package com.yoga.classservice.controller;

import com.yoga.classservice.model.requestwrapper.EventRegistrationRequest;
import com.yoga.classservice.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @PostMapping("/event/student")
    public void registerStudentForEvent(@RequestBody EventRegistrationRequest eventRegistrationRequest) {
        registrationService.registerStudentForEvent(eventRegistrationRequest.getPersonId(),eventRegistrationRequest.getEventId());
    }

    @PostMapping("/event")
    public void registerEvent(@RequestBody EventRegistrationRequest eventRegistrationRequest) {
        registrationService.registerTeacherForEvent(eventRegistrationRequest.getPersonId(),eventRegistrationRequest.getEventId());
    }
}
