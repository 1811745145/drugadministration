package com.jk.controller;

import com.jk.pojo.MedicineBean;
import com.jk.pojo.WebDrugBean;
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
    public List<WebDrugBean> queryMedicineList(WebDrugBean webDrugBean){
        List<WebDrugBean> queryMedicineList = medicineService.queryMedicineList(webDrugBean);
        return queryMedicineList;
    }

    //查询药品精选详情
    @PostMapping("queryMedicine")
    @ResponseBody
    public WebDrugBean queryMedicine(@RequestBody String id){
        WebDrugBean queryMedicine = medicineService.queryMedicine(id);
        return queryMedicine;
    }

}
