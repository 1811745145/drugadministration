package com.jk.controller;

import com.jk.mapper.MedicalHomeMapper;
import com.jk.pojo.WebDrugBean;
import com.jk.pojo.WebTree;
import com.jk.service.MedicalHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MedicalHomeController implements MedicalHomeService {

    @Autowired
    private MedicalHomeMapper  medicalHomeMapper;

    @Override
    @ResponseBody
    public WebDrugBean selectCar(Integer spid) {
        WebDrugBean webDrugBean=medicalHomeMapper.selectCar(spid);
        return webDrugBean;
    }

    @Override
    @ResponseBody
    public List<WebDrugBean> selectDrupList() {
        List<WebDrugBean>  webDrugBean=medicalHomeMapper.selectDrupList();
        return webDrugBean;
    }

    @Override
    @ResponseBody
    public List<WebTree> selectTree1(Integer pid) {
        List<WebTree> list=medicalHomeMapper.selectTree1(pid);
        return list;
    }

    @Override
    @ResponseBody
    public List<WebDrugBean> selectTjsp() {
        List<WebDrugBean> list=medicalHomeMapper.selectTjsp();
        return list;
    }


}
