package com.jk.controller;

import com.jk.mapper.MedicalHomeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MedicalHomeController {

    @Autowired
    private MedicalHomeMapper  medicalHomeMapper;
}
