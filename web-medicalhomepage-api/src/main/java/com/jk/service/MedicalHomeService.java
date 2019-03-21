package com.jk.service;

import com.jk.pojo.WebDrugBean;
import com.jk.pojo.WebTree;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("MedicalHomeService")
public interface MedicalHomeService {

    @RequestMapping("selectCar")
    WebDrugBean selectCar(@RequestParam("spid") Integer spid);

    @RequestMapping("selectDrupList")
    List<WebDrugBean> selectDrupList();

    @RequestMapping("selectTree1")
    List<WebTree> selectTree1(@RequestParam("pid") Integer pid);

    @RequestMapping("selectTjsp")
    List<WebDrugBean> selectTjsp();
}
