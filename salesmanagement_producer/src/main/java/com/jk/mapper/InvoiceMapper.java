package com.jk.mapper;

import com.jk.pojo.DeliverBean;

import java.util.HashMap;
import java.util.List;

public interface InvoiceMapper {

    //发票统计数量
    int queryInvoiceCount(HashMap<String, Object> hashMap);

    //发票查询
    List<DeliverBean> queryInvoiceList(HashMap<String, Object> hashMap);
}
