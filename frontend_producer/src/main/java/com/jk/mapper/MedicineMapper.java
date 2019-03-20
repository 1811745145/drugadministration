package com.jk.mapper;

import com.jk.pojo.MedicineBean;


import java.util.List;

public interface MedicineMapper {

    //查询药品精选
    List<MedicineBean> queryMedicineList(MedicineBean medicineBean);

}
