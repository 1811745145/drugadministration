package com.jk.service;

import com.jk.pojo.InvoiceBean;
import com.jk.util.PageResult;

public interface InvoiceSerive {

    //发票查询
    PageResult getDeliver(Integer page, Integer rows, InvoiceBean invoiceBean);
}
