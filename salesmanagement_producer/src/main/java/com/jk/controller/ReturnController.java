package com.jk.controller;

import com.jk.pojo.ReturnBean;
import com.jk.service.ReturnService;
import com.jk.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReturnController {

    @Autowired
    private ReturnService returnService;

    //退货查询
    @RequestMapping("getReturn")
    @ResponseBody
    public PageResult getReturn(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, @RequestBody ReturnBean returnBean) {
        return returnService.getDeliver(page, rows, returnBean);
    }
}
