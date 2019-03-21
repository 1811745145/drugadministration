package com.jk.client;

import com.jk.pojo.MedicineBean;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@FeignClient("frontendProducer")
public interface MedicineClinet {

    //查询药品精选
    @PostMapping("queryMedicineList")
    List<MedicineBean> queryMedicineList(MedicineBean medicineBean);

    //查询药品精选详情
    @PostMapping("queryMedicine")
    MedicineBean queryMedicine(String id);
}
