package com.jk.controller;


import com.jk.pojo.SalesBean;
import com.jk.service.SalesService;
import com.jk.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SalesController {

    @Autowired
    private SalesService salesService;

    //销售查询
    @RequestMapping("getSales")
    @ResponseBody
    public PageResult getEnterprise(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, @RequestBody SalesBean salesBean) {
        return salesService.getSales(page, rows, salesBean);
    }
}
