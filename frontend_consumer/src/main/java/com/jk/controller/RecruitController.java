package com.jk.controller;

import com.jk.client.RecruitClient;
import com.jk.pojo.DeliverBean;
import com.jk.pojo.RecruitBean;
import com.jk.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("recruit")
public class RecruitController {

    @Autowired
    private RecruitClient recruitClient;

    //跳转招商信息页面
    @RequestMapping("toRecruit")
    public String toRecruit(){
        return "recruitList";
    }

    //招商信息查询
    @RequestMapping("getRecruit")
    @ResponseBody
    public PageResult getRecruit(Integer page, Integer rows, RecruitBean recruitBean) {
        return recruitClient.getRecruit(page, rows, recruitBean);
    }

    //查询招商商品
    @RequestMapping("queryRecruit")
    @ResponseBody
    public List<RecruitBean> queryRecruit(RecruitBean recruitBean){
        List<RecruitBean> queryRecruit = recruitClient.queryRecruit(recruitBean);
        return queryRecruit;
    }

    //查询最新招商
    @RequestMapping("queryInvestment")
    @ResponseBody
    public List<RecruitBean> queryInvestment(RecruitBean recruitBean){
        List<RecruitBean> queryInvestment = recruitClient.queryInvestment(recruitBean);
        return queryInvestment;

    }

    //跳转到最新招商详情（代理）
    @RequestMapping("toAgent")
    public String toAgent(){
        return "agentList";
    }

    //查询最新招商详情（代理）
    @RequestMapping("queryAgent")
    @ResponseBody
    public RecruitBean queryAgent(String id){
        RecruitBean queryAgent = recruitClient.queryAgent(id);
        return queryAgent;
    }

}
