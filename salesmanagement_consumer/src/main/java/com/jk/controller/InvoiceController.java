package com.jk.controller;

import com.jk.client.InvoiceClient;
import com.jk.pojo.InvoiceBean;
import com.jk.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("invoice")
public class InvoiceController {

    @Autowired
    private InvoiceClient invoiceClient;

    //跳转发票查询页面
    @RequestMapping("toInvoice")
    public String toInvoice(){
        return "invoiceList";
    }

    //发票查询
    @RequestMapping("getInvoice")
    @ResponseBody
    public PageResult getInvoice(Integer page, Integer rows, InvoiceBean invoiceBean) {
        return invoiceClient.invokeInvoice(page, rows, invoiceBean);
    }
}
