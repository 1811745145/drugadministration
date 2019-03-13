package com.jk.service.impl;

import com.jk.mapper.TreeMapper;
import com.jk.pojo.TreeBean;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeServiceImpl implements TreeService {

    @Autowired
    private TreeMapper treeMapper;

    //树
    @Override
    public List<TreeBean> bootstraptree() {
        int id = 0;
        List<TreeBean> bootreeNode = bootreeNode(id);
        return bootreeNode;
    }
    private List<TreeBean> bootreeNode(int id) {
        List<TreeBean> bootstraptree = treeMapper.bootstraptree(id);
        for (TreeBean bootstapBean2 : bootstraptree) {
            Integer id2 = bootstapBean2.getId();
            List<TreeBean> bootreeNode = bootreeNode(id2);
            if (bootreeNode == null || bootreeNode.size() <= 0) {
                bootstapBean2.setSelectable(true);
            } else {
                bootstapBean2.setSelectable(false);
                bootstapBean2.setNodes(bootreeNode);
            }
        }
        return bootstraptree;
    }
}
