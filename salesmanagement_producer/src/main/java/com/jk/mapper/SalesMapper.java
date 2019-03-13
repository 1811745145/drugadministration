package com.jk.mapper;

import com.jk.pojo.DeliverBean;

import java.util.HashMap;
import java.util.List;

public interface SalesMapper {

    //销售统计数量
    int querySalesCount(HashMap<String, Object> hashMap);

    //销售查询
    List<DeliverBean> querySalesList(HashMap<String, Object> hashMap);
}
