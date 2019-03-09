package com.jk.service;

import com.jk.pojo.MedicineDrugdetailsBean;
import com.jk.pojo.MedicineSupplierBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface DrugPurchaseService {

    /*查询药品采购信息  and  条件查询*/
    @RequestMapping("QueryDrugPurchase")
    List<MedicineDrugdetailsBean> QueryDrugPurchase(MedicineDrugdetailsBean medicineDrugdetailsBean);
    /* 查询厂商信息*/
    @RequestMapping("QuerySupplierBean")
    List<MedicineSupplierBean> QuerySupplierBean();
}
