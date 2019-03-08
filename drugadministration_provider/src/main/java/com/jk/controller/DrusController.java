package com.jk.controller;

import com.jk.mapper.DrusMapper;
import com.jk.pojo.TreeBean;
import com.jk.service.DrusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DrusController implements DrusService {
    @Autowired
    private DrusMapper drusMapper;

    @Override
    @ResponseBody
    public List<TreeBean> findTreeList() {
        int id = -1;
        List<TreeBean> list = getTreeBeans(id);
        return list;
    }

    private List<TreeBean> getTreeBeans(int id) {
        List<TreeBean> list = drusMapper.findTreeList(id);
        for (TreeBean treeBean : list) {
            List<TreeBean> treeBeans = getTreeBeans(treeBean.getId());
            if(treeBeans == null || treeBeans.size()<=0){
                treeBean.setSelectable(true);
            }else{
                treeBean.setSelectable(false);
                treeBean.setNodes(treeBeans);
            }
        }
        return list;
    }
}
