package com.jk.service.impl;

import com.jk.mapper.SalesMapper;
import com.jk.pojo.DeliverBean;
import com.jk.pojo.SalesBean;
import com.jk.service.SalesService;
import com.jk.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class SalesServiceImpl implements SalesService {

    @Autowired
    private SalesMapper salesMapper;

    //销售查询
    @Override
    public PageResult getSales(Integer page, Integer rows, SalesBean salesBean) {
        PageResult pageResult = new PageResult();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("salesBean", salesBean);
        int count = salesMapper.querySalesCount(hashMap);
        pageResult.setTotal(count);
        hashMap.put("startIndex", (page - 1) * rows);
        hashMap.put("endIndex", rows);
        List<DeliverBean> list = salesMapper.querySalesList(hashMap);
        pageResult.setRows(list);
        return pageResult;
    }
}
