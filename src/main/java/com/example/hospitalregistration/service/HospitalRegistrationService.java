package com.example.hospitalregistration.service;

import com.example.hospitalregistration.exception.DoctorNotFoundException;
import com.example.hospitalregistration.model.Doctor;

import java.util.List;

public interface HospitalRegistrationService {
    List<Doctor> findDoctors();
    List<Doctor> findDoctors(String lastname);
    Doctor findDoctor(Long id) throws DoctorNotFoundException;
    void createDoctor(Doctor doctor);
    void update(Doctor doctor);
    void deleteDoctor(Long id);
}
