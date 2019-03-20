package com.jk.service;

import com.jk.pojo.RecruitBean;
import com.jk.util.PageResult;

import java.util.List;

public interface RecruitService {

    //招商信息查询
    PageResult getRecruit(Integer page, Integer rows, RecruitBean recruitBean);

    //查询招商商品
    List<RecruitBean> queryRecruit(RecruitBean recruitBean);
}
