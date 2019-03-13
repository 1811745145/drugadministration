package com.jk.controller;



import com.jk.pojo.MedicineDrugdetailsBean;
import com.jk.pojo.MedicineOrderlistBean;
import com.jk.pojo.MedicineSupplierBean;
import com.jk.pojo.ShoppingCartBean;
import com.jk.service.DrugPurchaseServiceWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("DrugPurchaseController")
public class DrugPurchaseController {

    @Autowired
    private DrugPurchaseServiceWeb drugPurchaseServiceWeb;


    /*查询药品采购信息 and  条件查询药品采购信息*/
    @ResponseBody
    @RequestMapping("queryDrugPurchase")
    public List<MedicineDrugdetailsBean> QueryDrugPurchase(MedicineDrugdetailsBean  medicineDrugdetailsBean){
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

    /*新增购物车*/
    @ResponseBody
    @RequestMapping("AddShoppingCart")
    public String AddShoppingCart(Integer supplierId,Integer boxCount,Integer  drugdetailsid){
        drugPurchaseServiceWeb.AddShoppingCart(supplierId,boxCount,drugdetailsid);
        return   "1";
    }

    /*查询购物车*/
    @ResponseBody
    @RequestMapping("SelectShoppingCart")
    public  List<ShoppingCartBean> SelectShoppingCart(){
        List<ShoppingCartBean> map= drugPurchaseServiceWeb.SelectShoppingCart();
        return   map;
    }
    /*查询药品采购清单*/
    @ResponseBody
    @RequestMapping("SelectDrugPurchaseList")                /* 订单号       厂商id*/
    public List<MedicineOrderlistBean> SelectDrugPurchaseList(MedicineOrderlistBean medicineOrderlistBean){
        List<MedicineOrderlistBean> map= drugPurchaseServiceWeb.SelectDrugPurchaseList(medicineOrderlistBean);
        return   map;
    }
}
