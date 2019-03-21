package com.jk.controller;

import com.jk.pojo.MedicineBean;
import com.jk.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    //查询药品精选详情
    @PostMapping("queryMedicine")
    @ResponseBody
    public MedicineBean queryMedicine(@RequestBody String id){
        MedicineBean queryMedicine = medicineService.queryMedicine(id);
        return queryMedicine;
    }

}