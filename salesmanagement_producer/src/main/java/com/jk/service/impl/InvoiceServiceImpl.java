package com.jk.service.impl;

import com.jk.mapper.InvoiceMapper;
import com.jk.pojo.DeliverBean;
import com.jk.pojo.InvoiceBean;
import com.jk.service.InvoiceSerive;
import com.jk.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceSerive {

    @Autowired
    private InvoiceMapper invoiceMapper;

    //发票查询
    @Override
    public PageResult getDeliver(Integer page, Integer rows, InvoiceBean invoiceBean) {
        PageResult pageResult = new PageResult();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("invoiceBean", invoiceBean);
        int count = invoiceMapper.queryInvoiceCount(hashMap);
        pageResult.setTotal(count);
        hashMap.put("startIndex", (page - 1) * rows);
        hashMap.put("endIndex", rows);
        List<DeliverBean> list = invoiceMapper.queryInvoiceList(hashMap);
        pageResult.setRows(list);
        return pageResult;
    }
}
