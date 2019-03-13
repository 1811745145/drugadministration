package com.jk.controller;

import com.jk.client.SalesClient;
import com.jk.pojo.SalesBean;
import com.jk.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("sales")
public class SalesController {

    @Autowired
    private SalesClient salesClient;

    //跳转销售查询页面
    @RequestMapping("toSales")
    public String toSales(){
        return "salesList";
    }

    //销售查询
    @RequestMapping("getSales")
    @ResponseBody
    public PageResult getSales(Integer page, Integer rows, SalesBean salesBean) {
        return salesClient.invokeSales(page, rows, salesBean);
    }


}
