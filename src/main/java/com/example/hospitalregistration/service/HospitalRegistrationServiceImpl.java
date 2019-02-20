package com.example.hospitalregistration.service;

import com.example.hospitalregistration.dao.DoctorRepository;
import com.example.hospitalregistration.exception.DoctorNotFoundException;
import com.example.hospitalregistration.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalRegistrationServiceImpl implements HospitalRegistrationService {

    private DoctorRepository doctorRepository;

    @Autowired
    public void setDoctorRepository(DoctorRepository doctorRepository){
        this.doctorRepository = doctorRepository;
    }



    @Override
    public List<Doctor> findDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public List<Doctor> findDoctors(String lastname) {
        return doctorRepository.finByLastName(lastname);
    }

    @Override
    public Doctor findDoctor(Long id) throws DoctorNotFoundException {
        Doctor doctor = doctorRepository.findById(id);
        if (doctor ==null) throw new DoctorNotFoundException("Doctor not found with id:"+id);
        return doctor;
    }

    @Override
    public void createDoctor(Doctor doctor) {
        doctorRepository.create(doctor);

    }

    @Override
    public void update(Doctor doctor) {
        doctorRepository.update(doctor);

    }

    @Override
    public void deleteDoctor(Long id) {

        doctorRepository.delete(id);
    }


}
