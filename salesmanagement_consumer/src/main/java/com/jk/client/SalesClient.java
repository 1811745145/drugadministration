package com.jk.client;

import com.jk.pojo.SalesBean;
import com.jk.util.PageResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient("producer")
public interface SalesClient {

    //销售查询
    @PostMapping("getSales")
    PageResult invokeSales(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, @RequestBody SalesBean salesBean);
}
