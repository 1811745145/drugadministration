package com.jk.service;

import com.jk.pojo.MedicineDrugdetailsBean;
import com.jk.pojo.MedicineOrderlistBean;
import com.jk.pojo.MedicineSupplierBean;
import com.jk.pojo.ShoppingCartBean;
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
    /*新增购物车*/
    @RequestMapping("AddShoppingCart")
    void AddShoppingCart(@RequestParam("supplierId")Integer supplierId,@RequestParam("boxCount") Integer boxCount,@RequestParam("drugdetailsid")Integer drugdetailsid);

    /*查询购物车*/
    @RequestMapping("SelectShoppingCart")
    List<ShoppingCartBean> SelectShoppingCart();

   /*查询采购订单*/
    @RequestMapping("SelectDrugPurchaseList")
    List<MedicineOrderlistBean> SelectDrugPurchaseList(MedicineOrderlistBean medicineOrderlistBean);
}
