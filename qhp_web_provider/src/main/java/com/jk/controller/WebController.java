package com.jk.controller;

import com.jk.mapper.WebMapper;
import com.jk.pojo.*;
import com.jk.service.WebServiceApi;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class WebController implements WebServiceApi {
    @Autowired
    private WebMapper webMapper;

    @Override
    @ResponseBody
    public List<ShoPing> findshopingList() {
        return webMapper.findshopingList();
    }

    @Override
    @ResponseBody
    public List<DianPu> findDianPu() {
        return webMapper.findDianPu();
    }

    @Override
    @ResponseBody
    public HashMap<String, Object> findUserList(@RequestBody Daili daili, @RequestParam("page") Integer page, @RequestParam("rows") Integer rows) {
        HashMap<String, Object> params = new HashMap<>();
        int count = webMapper.queryCount(daili);
        //分页查询
        int start = (page-1)*rows;//开始条数
        List<Daili> list = webMapper.findUserList(daili,start,rows);
        params.put("total", count);
        params.put("rows", list);
        return params;
    }

    @Override
    @ResponseBody
    public List<Fenlei> findYijiSelect(@RequestParam("id") Integer id) {
        return webMapper.findYijiSelect(id);
    }



    @Override
    @ResponseBody
    public HashMap<String, Object> findGongyingList(@RequestBody Gongying gongying,@RequestParam("page") Integer page,@RequestParam("rows") Integer rows) {
        HashMap<String, Object> params = new HashMap<>();
        int count = webMapper.findGongyingCount(gongying);
        //分页查询
        int start = (page-1)*rows;//开始条数
        List<Gongying> list = webMapper.findGongyingList(gongying,start,rows);
        params.put("total", count);
        params.put("rows", list);
        return params;
    }

    //求购
    @Override
    @ResponseBody
    public HashMap<String, Object> findQiuGouList(@RequestBody QiuGou qiuGou, @RequestParam("page") Integer page, @RequestParam("rows") Integer rows) {
        HashMap<String, Object> params = new HashMap<>();
        int count = webMapper.findQiuGouCount(qiuGou);
        //分页查询
        int start = (page-1)*rows;//开始条数
        List<Gongying> list = webMapper.findQiuGouList(qiuGou,start,rows);
        params.put("total", count);
        params.put("rows", list);
        return params;
    }

    @Override
    @ResponseBody
    public void regSave(@RequestBody UserBean userBean) {
        webMapper.regSave(userBean);
    }

    @Override
    @ResponseBody
    public UserBean findUserByName(@RequestBody UserBean loginPojo) {


        return webMapper.findUserByName(loginPojo.getUserName());
    }


}
