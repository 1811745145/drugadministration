package com.jk.controller;

import com.jk.client.DelicerClient;
import com.jk.pojo.DeliverBean;
import com.jk.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("deliver")
public class DeliverController {

    @Autowired
    private DelicerClient delicerClient;

    //跳转发货查询页面
    @RequestMapping("toDeliver")
    public String toDeliver(){
        return "deliverList";
    }

    //发货分页查询
    @RequestMapping("getDeliver")
    @ResponseBody
    public PageResult getDeliver(Integer page, Integer rows, DeliverBean deliverBean) {
        return delicerClient.invokeDeliver(page, rows, deliverBean);
    }

}
