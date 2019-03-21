package com.jk.controller;

import com.jk.pojo.*;
import com.jk.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class WebConreoller {
    @Autowired
    private WebService webService;


    //供应商
    @RequestMapping("findGongyingList")
    @ResponseBody
    public HashMap<String,Object>findGongyingList(Gongying gongying, @RequestParam("page")Integer page, @RequestParam("rows")Integer rows){
        return webService.findGongyingList(gongying,page,rows);
    }

    //求购商
    @RequestMapping("findQiuGouList")
    @ResponseBody
    public HashMap<String,Object>findQiuGouList(QiuGou qiuGou, @RequestParam("page")Integer page, @RequestParam("rows")Integer rows){
        return webService.findQiuGouList(qiuGou,page,rows);
    }




    //查询店铺
    @RequestMapping("findDianPu")
    @ResponseBody
    public List<DianPu> findDianPu(){
        return webService.findDianPu();
    }

    //查询商品
    @RequestMapping("findshopingList")
    @ResponseBody
    public List<ShoPing> findshopingList(){
        return webService.findshopingList();
    }

    //代理分页
    @RequestMapping("findUserList")
    @ResponseBody
    public HashMap<String,Object>findUserList(Daili daili,@RequestParam("page")Integer page, @RequestParam("rows")Integer rows){
        return webService.findUserList(daili,page,rows);
    }

    //跳转该页面代理
    @RequestMapping("daili")
    public String daili(){
        return "daili";
    }



    //查询分类
    @RequestMapping("findYijiSelect")
    @ResponseBody
    public List<Fenlei> findYijiSelect(@RequestParam("id")Integer id){
        return webService.findYijiSelect(id);
    }

}
