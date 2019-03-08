package com.jk.service;

import com.jk.pojo.TreeBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequestMapping("drus")
public interface DrusService {
    @RequestMapping("findTreeList")
    List<TreeBean> findTreeList();
}
