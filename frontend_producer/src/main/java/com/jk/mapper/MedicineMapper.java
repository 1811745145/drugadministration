package com.jk.mapper;

import com.jk.pojo.MedicineBean;
import com.jk.pojo.WebDrugBean;


import java.util.List;

public interface MedicineMapper {

    //查询药品精选
    List<WebDrugBean> queryMedicineList(WebDrugBean webDrugBean);

    //查询药品精选详情
    WebDrugBean queryMedicine(String id);
}
