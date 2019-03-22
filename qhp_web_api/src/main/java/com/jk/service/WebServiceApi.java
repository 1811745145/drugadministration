package com.jk.service;


import com.jk.pojo.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
@RequestMapping("shop")
public interface WebServiceApi {

    @RequestMapping("findshopingList")
    List<ShoPing> findshopingList();

    @RequestMapping("findDianPu")
    List<DianPu> findDianPu();

    @RequestMapping("findUserList")
    HashMap<String, Object> findUserList(Daili daili,@RequestParam("page") Integer page, @RequestParam("rows") Integer rows);

    @RequestMapping("findYijiSelect")
    List<Fenlei> findYijiSelect(@RequestParam("id") Integer id);


    @RequestMapping("findGongyingList")
    HashMap<String, Object> findGongyingList(Gongying gongying, @RequestParam("page") Integer page, @RequestParam("rows") Integer rows);

    @RequestMapping("findQiuGouList")
    HashMap<String, Object> findQiuGouList(QiuGou qiuGou, @RequestParam("page") Integer page, @RequestParam("rows") Integer rows);

    @RequestMapping("userBean")
    void regSave(UserBean userBean);
}
