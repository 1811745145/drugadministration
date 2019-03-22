package com.jk.controller;

import com.jk.client.MedicineClinet;
import com.jk.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("medicine")
public class MedicineContoller {

    @Autowired
    private MedicineClinet medicineClinet;

    @Resource
    private RedisTemplate<String, List<MedicineBean>> redisTemplate;

    //跳转医药会展页面
    @RequestMapping("toMedicine")
    public String toMedicine(){
        return "medicineList";
    }

    //查询药品精选
    @RequestMapping("queryMedicineList")
    @ResponseBody
    public List<WebDrugBean> queryMedicineList(WebDrugBean webDrugBean){
        List<WebDrugBean> queryMedicineList = medicineClinet.queryMedicineList(webDrugBean);
        return queryMedicineList;
    }

    //跳转商品详情页面
    @RequestMapping("toDetails")
    public String toDetails(){
        return "detailsList";
    }

    //查询药品精选详情
    @RequestMapping("queryMedicine")
    @ResponseBody
    public WebDrugBean queryMedicine(String id){
        WebDrugBean queryMedicine = medicineClinet.queryMedicine(id);
        return queryMedicine;
    }

}
