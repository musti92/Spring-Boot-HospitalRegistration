package com.example.hospitalregistration.controller;

import com.example.hospitalregistration.exception.DoctorNotFoundException;
import com.example.hospitalregistration.model.Doctor;
import com.example.hospitalregistration.service.HospitalRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class HospitalRegistrationRestController {
    @Autowired
    private HospitalRegistrationService hospitalRegistrationService;

    @RequestMapping(method = RequestMethod.GET,value = "/doctors")
    public ResponseEntity<List<Doctor>> getDoctors(){
       List<Doctor> people = hospitalRegistrationService.findDoctors();
       return ResponseEntity.ok(people);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/doctor")
    public ResponseEntity<List<Doctor>> getDoctors(@RequestParam("ln") String lastname){
        List<Doctor> people = hospitalRegistrationService.findDoctors(lastname);
        return ResponseEntity.ok(people);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/doctor/{id}")
    public ResponseEntity<Doctor> getDoctor(@PathVariable("id") Long id){
        try {
            Doctor doctor = hospitalRegistrationService.findDoctor(id);
            return ResponseEntity.ok(doctor);
        } catch (DoctorNotFoundException ex){
            return ResponseEntity.notFound().build();
        }
    }
}
