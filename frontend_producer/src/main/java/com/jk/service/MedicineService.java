package com.jk.service;

import com.jk.pojo.MedicineBean;

import java.util.List;

public interface MedicineService {

    //查询药品精选
    List<MedicineBean> queryMedicineList(MedicineBean medicineBean);
}
