package com.jk.controller;

import com.jk.pojo.MedicineDrugdetailsBean;

import com.jk.pojo.MedicineSupplierBean;
import com.jk.service.DrugPurchaseServiceWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("DrugPurchaseController")
public class DrugPurchaseController {

    @Autowired
    private DrugPurchaseServiceWeb drugPurchaseServiceWeb;


    /*查询药品采购信息 and  条件查询药品采购信息*/
    @ResponseBody
    @RequestMapping("queryDrugPurchase")
    public List<MedicineDrugdetailsBean> QueryDrugPurchase(MedicineDrugdetailsBean medicineDrugdetailsBean){
        List<MedicineDrugdetailsBean> list=drugPurchaseServiceWeb.QueryDrugPurchase(medicineDrugdetailsBean);
        return   list;
    }
    /*查询药品厂商信息*/
    @ResponseBody
    @RequestMapping("QuerySupplierBean")
    public List<MedicineSupplierBean> QuerySupplierBean(){
        List<MedicineSupplierBean> list=drugPurchaseServiceWeb.QuerySupplierBean();
        return   list;
    }
}
