package com.jk.controller;

import com.jk.pojo.InvoiceBean;
import com.jk.service.InvoiceSerive;
import com.jk.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InvoiceController {

    @Autowired
    private InvoiceSerive invoiceSerive;

    //发票分页查询
    @PostMapping("getInvoice")
    @ResponseBody
    public PageResult getInvoice(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, @RequestBody InvoiceBean invoiceBean) {
        return invoiceSerive.getDeliver(page, rows, invoiceBean);
    }
}
