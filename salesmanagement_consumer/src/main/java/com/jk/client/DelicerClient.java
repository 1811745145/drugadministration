package com.jk.client;

import com.jk.pojo.DeliverBean;
import com.jk.util.PageResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("producer")
public interface DelicerClient {

    //分页查询
    @PostMapping("getDeliver")
    PageResult invokeDeliver(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, @RequestBody DeliverBean deliverBean);
}
