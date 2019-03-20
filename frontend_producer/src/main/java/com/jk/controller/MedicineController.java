package com.jk.controller;

import com.jk.pojo.MedicineBean;
import com.jk.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    //查询药品精选
    @PostMapping("queryMedicineList")
    @ResponseBody
    public List<MedicineBean> queryMedicineList(MedicineBean medicineBean){
        List<MedicineBean> queryMedicineList = medicineService.queryMedicineList(medicineBean);
        return queryMedicineList;

    }

}
