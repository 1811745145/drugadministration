package com.jk.mapper;

import com.jk.pojo.RecruitBean;

import java.util.HashMap;
import java.util.List;

public interface RecruitMapper {

    //招商信息统计数量
    int queryRecruitCount(HashMap<String, Object> hashMap);

    //招商信息查询
    List<RecruitBean> queryRecruitList(HashMap<String, Object> hashMap);

    //查询招商商品
    List<RecruitBean> queryRecruit(RecruitBean recruitBean);

    //查询最新招商
    List<RecruitBean> queryInvestment(RecruitBean recruitBean);
}
