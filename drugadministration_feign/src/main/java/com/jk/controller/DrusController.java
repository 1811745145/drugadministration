package com.jk.controller;

import com.jk.pojo.TreeBean;
import com.jk.service.DrusServicefeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DrusController {
    @Autowired
    private DrusServicefeign drusServicefeign;

    @RequestMapping("show")
    public String show(){
        return "show";
    }

    @RequestMapping("findTreeList")
    @ResponseBody
    public List<TreeBean> findTreeList(){
        return drusServicefeign.findTreeList();
    }
}
