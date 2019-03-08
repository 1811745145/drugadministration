package com.jk.controller;

import com.jk.mapper.DrusMapper;
import com.jk.pojo.Address;
import com.jk.pojo.DrugNoReturn;
import com.jk.pojo.TreeBean;
import com.jk.service.DrusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DrusController implements DrusService {
    @Autowired
    private DrusMapper drusMapper;

    /**
     * 查询树结构
     * @return
     */
    @Override
    @ResponseBody
    public List<TreeBean> findTreeList() {
        int id = -1;
        List<TreeBean> list = getTreeBeans(id);
        return list;
    }

    /**
     * 查询地址管理中心
     * @return
     */
    @Override
    @ResponseBody
    public List<Address> queryaddressList() {
        return drusMapper.queryaddressList();
    }

    /**
     * 删除
     * @param addressId
     */
    @Override
    public void delById(@RequestParam("addressId") Integer addressId) {
        drusMapper.delById(addressId);
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

    /**
     * 退货商品查询
     * @return
     */
    @Override
    @ResponseBody
    public List<DrugNoReturn> returnList() {

        return drusMapper.returnList();
    }
}
