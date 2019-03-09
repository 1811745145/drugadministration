package com.jk.mapper;

import com.jk.pojo.MedicineDrugdetailsBean;
import com.jk.pojo.MedicineSupplierBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrugPurchaseMapper {

    List<MedicineDrugdetailsBean> QueryDrugPurchase(@Param("medicineDrugdetailsBean") MedicineDrugdetailsBean medicineDrugdetailsBean);

    List<MedicineSupplierBean> QuerySupplierBean();
}
