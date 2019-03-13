package com.jk.client;

import com.jk.pojo.InvoiceBean;
import com.jk.util.PageResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("producer")
public interface InvoiceClient {

    //发票查询
    @PostMapping("getInvoice")
    PageResult invokeInvoice(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, @RequestBody InvoiceBean invoiceBean);
}
