package com.example.hospitalregistration.dao;

import com.example.hospitalregistration.model.Person;

import java.util.List;

public interface PersonRepository {

    Person findById(Long id);
    List<Person> findByDoctorId(Long doctorId);
    void create(Person person);
    Person update(Person person);
    void delete(Long id);
    void deleteByDoctorId(Long doctorId);
}
