package com.jk.mapper;

import com.jk.pojo.MedicineDrugdetailsBean;
import com.jk.pojo.MedicineOrderlistBean;
import com.jk.pojo.MedicineSupplierBean;
import com.jk.pojo.ShoppingCartBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrugPurchaseMapper {

    List<MedicineDrugdetailsBean> QueryDrugPurchase(@Param("medicineDrugdetailsBean") MedicineDrugdetailsBean medicineDrugdetailsBean);

    List<MedicineSupplierBean> QuerySupplierBean();

    MedicineSupplierBean selectMedicineSupplierById(@Param("supplierId") Integer supplierId);

    MedicineDrugdetailsBean selectmedicineDrugdetailsById(@Param("drugdetailsid")Integer drugdetailsid);

    void AddShoppingCart(@Param("shoppingCartBean") ShoppingCartBean shoppingCartBean);

    void AddmedicineOrderlist(@Param("medicineOrderlistBean")MedicineOrderlistBean medicineOrderlistBean);

    void updateMedicineDrugdetailsById(@Param("boxCount")Integer boxCount,@Param("drugdetailsid")Integer drugdetailsid);

    List<ShoppingCartBean> SelectShoppingCart();

    List<MedicineOrderlistBean> SelectDrugPurchaseList(@Param("medicineOrderlistBean")MedicineOrderlistBean medicineOrderlistBean);
}
