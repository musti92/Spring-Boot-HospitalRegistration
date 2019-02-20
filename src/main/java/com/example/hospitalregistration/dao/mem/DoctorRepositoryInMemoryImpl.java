package com.example.hospitalregistration.dao.mem;

import com.example.hospitalregistration.dao.DoctorRepository;
import com.example.hospitalregistration.model.Doctor;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class DoctorRepositoryInMemoryImpl implements DoctorRepository {

    private Map<Long, Doctor> doctorMap=new HashMap<>();



    public DoctorRepositoryInMemoryImpl() {
        Doctor doctor1 =new Doctor();
        doctor1.setId(1L);
        doctor1.setFirstname("Metin");
        doctor1.setLastname("ATSIZ");
        doctor1.setProfession("Kadin Dogum Uzmani");

        Doctor doctor2 =new Doctor();
        doctor2.setId(2L);
        doctor2.setFirstname("mustafa");
        doctor2.setLastname("YILDIZ");
        doctor2.setProfession("Genel Cerrah");

        Doctor doctor3 =new Doctor();
        doctor3.setId(3L);
        doctor3.setFirstname("selim");
        doctor3.setLastname("KAYIK");
        doctor3.setProfession("Kardiolog");

        doctorMap.put(doctor1.getId(), doctor1);
        doctorMap.put(doctor2.getId(), doctor2);
        doctorMap.put(doctor3.getId(), doctor3);
    }

    @Override
    public List<Doctor> findAll() {
        return new ArrayList<>(doctorMap.values());
    }

    @Override
    public Doctor findById(Long id) {
        return doctorMap.get(id);
    }

    @Override
    public List<Doctor> finByLastName(String lastname) {
        return doctorMap.values().stream().filter(o ->o.getLastname().equals(lastname) ).collect(Collectors.toList());

    }

    @Override
    public void create(Doctor doctor) {
        doctor.setId(new Date().getTime());
        doctorMap.put(doctor.getId(), doctor);

    }

    @Override
    public Doctor update(Doctor doctor) {
        doctorMap.replace(doctor.getId(), doctor);
        return doctor;
    }

    @Override
    public void delete(Long id) {

        doctorMap.remove(id);

    }
}
