package com.jk.controller;

import com.jk.client.TreeClient;
import com.jk.pojo.TreeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("tree")
public class TreeController {

    @Autowired
    private TreeClient treeClient;

    //跳转树
    @RequestMapping("toTree")
    public String toTree() {
        return "tree";
    }

    //树
    @RequestMapping("gettree")
    @ResponseBody
    public List<TreeBean> bootstraptree() {
        return treeClient.bootstraptree();
    }
}
