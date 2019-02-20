package com.example.hospitalregistration;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
@EnableConfigurationProperties(value = PetClinicProperties.class)
public class PetClinicAplication {

    public static void main(String[] args){
        SpringApplication.run(PetClinicAplication.class,args);
    }
}
