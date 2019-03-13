package com.jk.service;

import com.jk.pojo.DeliverBean;
import com.jk.util.PageResult;

public interface DeliverService {

    //发货分页查询
    PageResult getDeliver(Integer page, Integer rows, DeliverBean deliverBean);
}
