package com.jk.controller;

import com.jk.pojo.DeliverBean;
import com.jk.service.DeliverService;
import com.jk.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeliverController {

    @Autowired
    private DeliverService deliverService;

    //发货分页查询
    @PostMapping("getDeliver")
    @ResponseBody
    public PageResult getEnterprise(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, @RequestBody DeliverBean deliverBean) {
        return deliverService.getDeliver(page, rows, deliverBean);
    }
}
