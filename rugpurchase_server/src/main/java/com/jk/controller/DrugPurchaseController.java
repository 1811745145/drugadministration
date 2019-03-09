package com.jk.controller;



import com.jk.mapper.DrugPurchaseMapper;
import com.jk.pojo.MedicineDrugdetailsBean;
import com.jk.pojo.MedicineSupplierBean;
import com.jk.service.DrugPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class DrugPurchaseController implements DrugPurchaseService {

    @Autowired
    private DrugPurchaseMapper drugPurchaseMapper;

    /*查询药品采购信息*/
    @Override
    @ResponseBody
    public List<MedicineDrugdetailsBean> QueryDrugPurchase(@RequestBody MedicineDrugdetailsBean medicineDrugdetailsBean) {
        List<MedicineDrugdetailsBean>  list=drugPurchaseMapper.QueryDrugPurchase(medicineDrugdetailsBean);
        return list;
    }

    /*查询厂商信息*/
    @Override
    @ResponseBody
    public List<MedicineSupplierBean> QuerySupplierBean() {
        List<MedicineSupplierBean> list=drugPurchaseMapper.QuerySupplierBean();
        return list;
    }


}
