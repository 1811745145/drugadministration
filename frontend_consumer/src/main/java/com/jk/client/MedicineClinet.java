package com.jk.client;

import com.jk.pojo.MedicineBean;
import com.jk.pojo.WebDrugBean;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@FeignClient("frontendProducer")
public interface MedicineClinet {

    //查询药品精选
    @PostMapping("queryMedicineList")
    List<WebDrugBean> queryMedicineList(WebDrugBean webDrugBeans);

    //查询药品精选详情
    @PostMapping("queryMedicine")
    WebDrugBean queryMedicine(String id);
}
