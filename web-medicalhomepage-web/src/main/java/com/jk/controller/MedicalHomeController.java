package com.jk.controller;

import com.jk.service.MedicalHomeServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("MedicalHomeController")
public class MedicalHomeController {

    @Autowired
    private MedicalHomeServiceFeign  medicalHomeServiceFeign;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("junmpMedicalHome")
    public   String  junmpMedicalHome(){
       return "home";
    }
    @RequestMapping("junmpclassify")
    public   String  junmpclassify(String name, Model  Model){
        Model.addAttribute("name",name);
        return "classify";
    }

    /*添加购物车*/
    @ResponseBody
    @RequestMapping("addshping")
    public   String  addshping(HttpServletRequest request){
        return "1";
    }

}
