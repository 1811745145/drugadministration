package com.jk.client;

import com.jk.pojo.ReturnBean;
import com.jk.util.PageResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("producer")
public interface ReturnClient {

    //退货查询
    @PostMapping("getReturn")
    PageResult invokeReturn(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, @RequestBody ReturnBean returnBean);
}
