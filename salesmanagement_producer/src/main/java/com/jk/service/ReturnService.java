package com.jk.service;

import com.jk.pojo.ReturnBean;
import com.jk.util.PageResult;

public interface ReturnService {

    //退货查询
    PageResult getDeliver(Integer page, Integer rows, ReturnBean returnBean);
}
