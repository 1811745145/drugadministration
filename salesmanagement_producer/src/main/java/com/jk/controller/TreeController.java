package com.jk.controller;

import com.jk.pojo.TreeBean;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TreeController {

    @Autowired
    private TreeService treeService;

    //树
    @PostMapping("gettree")
    @ResponseBody
    public List<TreeBean> bootstraptree() {
        return treeService.bootstraptree();
    }

}
