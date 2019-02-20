package com.example.hospitalregistration.dao;

import com.example.hospitalregistration.model.Doctor;

import java.util.List;

public interface DoctorRepository {
    List<Doctor> findAll();
    Doctor findById(Long id);
    List<Doctor> finByLastName(String lastname);
    void create(Doctor doctor);
    Doctor update(Doctor doctor);
    void delete(Long id);

}
