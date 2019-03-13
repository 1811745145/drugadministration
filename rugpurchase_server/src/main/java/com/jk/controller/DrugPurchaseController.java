package com.jk.controller;



import com.jk.mapper.DrugPurchaseMapper;
import com.jk.pojo.MedicineDrugdetailsBean;
import com.jk.pojo.MedicineOrderlistBean;
import com.jk.pojo.MedicineSupplierBean;
import com.jk.pojo.ShoppingCartBean;
import com.jk.service.DrugPurchaseService;
import com.jk.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
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

    /*新增购物车*/
    @Override
    @ResponseBody
    public void AddShoppingCart( Integer supplierId,Integer boxCount,Integer drugdetailsid) {
      /*查询供应商*/
        MedicineSupplierBean  medicineSupplierBean=drugPurchaseMapper.selectMedicineSupplierById(supplierId);
        System.out.println(medicineSupplierBean);
        /*查询商品*/
        MedicineDrugdetailsBean  medicineDrugdetailsBean=drugPurchaseMapper.selectmedicineDrugdetailsById(drugdetailsid);
        System.out.println(medicineDrugdetailsBean);

        /*添加购物车对象*/
        ShoppingCartBean shoppingCartBean = new ShoppingCartBean();
        /*药品id*/
        shoppingCartBean.setStId(drugdetailsid);
        /*厂商id*/
        shoppingCartBean.setCsId(medicineSupplierBean.getSupplierId());
        Double  StunitPrice=medicineDrugdetailsBean.getDrugdetailsNameprice()*boxCount;
        shoppingCartBean.setStunitPrice(StunitPrice);
        shoppingCartBean.setStCount(boxCount);
        shoppingCartBean.setStsubTotal(StunitPrice);
       drugPurchaseMapper.AddShoppingCart(shoppingCartBean);

       /*添加快速采购订单信息
       * */
        MedicineOrderlistBean medicineOrderlistBean = new MedicineOrderlistBean();
        String uuid = UUIDUtils.getUUID();
        medicineOrderlistBean.setOrderId(uuid);
        medicineOrderlistBean.setPaidTime(new Date());
        medicineOrderlistBean.setSupplierId(supplierId);
        medicineOrderlistBean.setDrugdetailsid(drugdetailsid);
        medicineOrderlistBean.setOrdercount(boxCount);
        medicineOrderlistBean.setDisbursements(StunitPrice);
        medicineOrderlistBean.setOrderStatus(1);
        drugPurchaseMapper.AddmedicineOrderlist(medicineOrderlistBean);

        /*修改药品库存*/
        drugPurchaseMapper.updateMedicineDrugdetailsById(boxCount,drugdetailsid);

    }

    /*查询购物车*/
    @ResponseBody
    @Override
    public List<ShoppingCartBean> SelectShoppingCart() {
        List<ShoppingCartBean>  list=drugPurchaseMapper.SelectShoppingCart();
        return list;
    }

    /*查询采购订单*/
    @ResponseBody
    @Override
    public List<MedicineOrderlistBean> SelectDrugPurchaseList(@RequestBody MedicineOrderlistBean medicineOrderlistBean) {
        List<MedicineOrderlistBean>  list=drugPurchaseMapper.SelectDrugPurchaseList(medicineOrderlistBean);
        return list;
    }


}
