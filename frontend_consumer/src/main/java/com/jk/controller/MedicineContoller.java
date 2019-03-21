package com.jk.controller;

import com.jk.client.MedicineClinet;
import com.jk.pojo.MedicineBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("medicine")
public class MedicineContoller {

    @Autowired
    private MedicineClinet medicineClinet;

    //跳转医药会展页面
    @RequestMapping("toMedicine")
    public String toMedicine(){
        return "medicineList";
    }

    //查询药品精选
    @RequestMapping("queryMedicineList")
    @ResponseBody
    public List<MedicineBean> queryMedicineList(MedicineBean medicineBean){
        List<MedicineBean> queryMedicineList = medicineClinet.queryMedicineList(medicineBean);
        return queryMedicineList;
    }

    //跳转商品详情页面
    @RequestMapping("toDetails")
    public String toDetails(){
        return "detailsList";
    }

    //查询药品精选详情
    @RequestMapping("queryMedicine")
    @ResponseBody
    public MedicineBean queryMedicine(String id){
        MedicineBean queryMedicine = medicineClinet.queryMedicine(id);
        return queryMedicine;
    }
}