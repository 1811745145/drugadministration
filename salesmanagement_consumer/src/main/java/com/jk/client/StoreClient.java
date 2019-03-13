package com.jk.client;

import com.jk.pojo.StoreBean;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("producer")
public interface StoreClient {


    //店铺新增
    @RequestMapping("saveStore")
    void saveStore(StoreBean storeBean);
}
