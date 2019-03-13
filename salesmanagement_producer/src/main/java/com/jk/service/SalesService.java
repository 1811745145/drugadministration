package com.jk.service;

import com.jk.pojo.SalesBean;
import com.jk.util.PageResult;

public interface SalesService {

    //销售查询
    PageResult getSales(Integer page, Integer rows, SalesBean salesBean);
}
