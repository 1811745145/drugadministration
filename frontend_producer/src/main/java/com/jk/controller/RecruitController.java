package com.jk.controller;

import com.jk.pojo.MedicineBean;
import com.jk.pojo.RecruitBean;
import com.jk.service.RecruitService;
import com.jk.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RecruitController {

    @Autowired
    private RecruitService recruitService;

    //招商信息查询
    @PostMapping("getRecruit")
    @ResponseBody
    public PageResult getRecruit(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, @RequestBody RecruitBean recruitBean) {
        return recruitService.getRecruit(page, rows, recruitBean);
    }

    //查询招商商品
    @PostMapping("queryRecruit")
    @ResponseBody
    public List<RecruitBean> queryRecruit(RecruitBean recruitBean){
        List<RecruitBean> queryRecruit = recruitService.queryRecruit(recruitBean);
        return queryRecruit;
    }

    //查询最新招商
    @PostMapping("queryInvestment")
    @ResponseBody
    public List<RecruitBean> queryInvestment(RecruitBean recruitBean){
        List<RecruitBean> queryInvestment = recruitService.queryInvestment(recruitBean);
        return queryInvestment;
    }

    //查询最新招商详情（代理）
    @PostMapping("queryAgent")
    @ResponseBody
    public RecruitBean queryAgent(@RequestBody String id){
        RecruitBean queryAgent = recruitService.queryAgent(id);
        return queryAgent;
    }

}
