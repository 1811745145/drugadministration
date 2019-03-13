package com.jk.controller;

import com.jk.pojo.StoreBean;
import com.jk.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StoreController {

    @Autowired
    private StoreService storeService;

    //店铺新增
    @RequestMapping("saveStore")
    @ResponseBody
    public Boolean saveStore(StoreBean storeBean) {
        if(storeBean.getId() == null) {
            try {
                //如果有id则修改，没有则新增
                storeService.saveStore(storeBean);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }



}
