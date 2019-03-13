package com.jk.controller;

import com.jk.client.ReturnClient;
import com.jk.pojo.DeliverBean;
import com.jk.pojo.ReturnBean;
import com.jk.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("return")
public class ReturnController {

    @Autowired
    private ReturnClient returnClient;

    //跳转退货页面
    @RequestMapping("toReturn")
    public String toReturn(){
        return "returnList";
    }

    //退货查询
    @RequestMapping("getReturn")
    @ResponseBody
    public PageResult getReturn(Integer page, Integer rows, ReturnBean returnBean) {
        return returnClient.invokeReturn(page, rows, returnBean);
    }
}
