package com.jk.service.impl;

import com.jk.mapper.ReturnMapper;
import com.jk.pojo.DeliverBean;
import com.jk.pojo.ReturnBean;
import com.jk.service.ReturnService;
import com.jk.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ReturnServiceImpl implements ReturnService{

    @Autowired
    private ReturnMapper returnMapper;

    //退货查询
    @Override
    public PageResult getDeliver(Integer page, Integer rows, ReturnBean returnBean) {
        PageResult pageResult = new PageResult();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("returnBean", returnBean);
        int count = returnMapper.queryReturnCount(hashMap);
        pageResult.setTotal(count);
        hashMap.put("startIndex", (page - 1) * rows);
        hashMap.put("endIndex", rows);
        List<DeliverBean> list = returnMapper.queryReturnList(hashMap);
        pageResult.setRows(list);
        return pageResult;
    }
}
