package com.jk.service.impl;

import com.jk.mapper.MedicineMapper;
import com.jk.pojo.MedicineBean;
import com.jk.pojo.RecruitBean;
import com.jk.service.MedicineService;
import com.jk.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineMapper medicineMapper;

    //查询药品精选
    @Override
    public List<MedicineBean> queryMedicineList(MedicineBean medicineBean) {
        return medicineMapper.queryMedicineList(medicineBean);
    }



}
