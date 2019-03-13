package com.jk.mapper;

import com.jk.pojo.DeliverBean;

import java.util.HashMap;
import java.util.List;

public interface DeliverMapper {

    //发货分页统计数量
    int queryDeliverCount(HashMap<String, Object> hashMap);

    //发货分页查询
    List<DeliverBean> queryDeliverList(HashMap<String, Object> hashMap);
}
