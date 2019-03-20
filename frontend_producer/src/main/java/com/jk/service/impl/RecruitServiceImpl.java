package com.jk.service.impl;

import com.jk.mapper.RecruitMapper;
import com.jk.pojo.DeliverBean;
import com.jk.pojo.RecruitBean;
import com.jk.service.RecruitService;
import com.jk.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class RecruitServiceImpl implements RecruitService {

    @Autowired
    private RecruitMapper recruitMapper;

    //招商信息查询
    @Override
    public PageResult getRecruit(Integer page, Integer rows, RecruitBean recruitBean) {
        PageResult pageResult = new PageResult();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("recruitBean", recruitBean);
        int count = recruitMapper.queryRecruitCount(hashMap);
        pageResult.setTotal(count);
        hashMap.put("startIndex", (page - 1) * rows);
        hashMap.put("endIndex", rows);
        List<RecruitBean> list = recruitMapper.queryRecruitList(hashMap);
        pageResult.setRows(list);
        return pageResult;
    }

    //查询招商商品
    @Override
    public List<RecruitBean> queryRecruit(RecruitBean recruitBean) {
        return recruitMapper.queryRecruit(recruitBean);
    }






}
