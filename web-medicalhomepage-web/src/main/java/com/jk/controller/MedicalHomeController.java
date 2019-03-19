package com.jk.controller;

import com.jk.service.MedicalHomeServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("MedicalHomeController")
public class MedicalHomeController {

    @Autowired
    private MedicalHomeServiceFeign  medicalHomeServiceFeign;


    @RequestMapping("junmpMedicalHome")
    public   String  junmpMedicalHome(){
       return   "西北医药网-更专业的医药交易服务平台";
    }

}
