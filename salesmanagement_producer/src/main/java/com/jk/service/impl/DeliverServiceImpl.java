package com.jk.service.impl;

import com.jk.mapper.DeliverMapper;
import com.jk.pojo.DeliverBean;
import com.jk.service.DeliverService;
import com.jk.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class DeliverServiceImpl implements DeliverService {

    @Autowired
    private DeliverMapper deliverMapper;

    //发货分页查询
    @Override
    public PageResult getDeliver(Integer page, Integer rows, DeliverBean deliverBean) {
        PageResult pageResult = new PageResult();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("deliverBean", deliverBean);
        int count = deliverMapper.queryDeliverCount(hashMap);
        pageResult.setTotal(count);
        hashMap.put("startIndex", (page - 1) * rows);
        hashMap.put("endIndex", rows);
        List<DeliverBean> list = deliverMapper.queryDeliverList(hashMap);
        pageResult.setRows(list);
        return pageResult;
    }
}
