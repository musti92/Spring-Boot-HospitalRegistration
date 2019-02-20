package com.example.hospitalregistration.controller;


import com.example.hospitalregistration.service.HospitalRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HospitalRegistrationClinicController {

    @Autowired
    private HospitalRegistrationService hospitalRegistrationService;

    @RequestMapping("/doctors")
    public ModelAndView getDoctors(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("doctors", hospitalRegistrationService.findDoctors());
        mv.setViewName("doctors");
        return mv;
    }


    @RequestMapping("/welcome")
    @ResponseBody
    public String welcome(){
        return "welcome spring web ";
    }

}
