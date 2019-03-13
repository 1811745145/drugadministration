package com.jk.mapper;

import com.jk.pojo.DeliverBean;

import java.util.HashMap;
import java.util.List;

public interface ReturnMapper {

    //退货统计数量
    int queryReturnCount(HashMap<String, Object> hashMap);

    //退货查询
    List<DeliverBean> queryReturnList(HashMap<String, Object> hashMap);
}
