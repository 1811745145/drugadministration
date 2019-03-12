package com.jk.controller;

import com.jk.mapper.DrusMapper;
import com.jk.pojo.*;
import com.jk.service.DrusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DrusController implements DrusService{
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
    @ResponseBody
    public void delById(@RequestParam("addressId") Integer addressId) {
        drusMapper.delById(addressId);
    }

    /**
     * 新增
     * @param address
     */
    @Override
    @ResponseBody
    public void saveAddress(@RequestBody Address address) {
        if(address.getAddress_Id()==null){
            drusMapper.saveAddress(address);
        }else{
            drusMapper.updateAddress(address);
        }

    }

    /**
     * 封装方法
     * @param id
     * @return
     */
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

    /**
     * 根据id查询
     * @param addressId
     * @return
     */
    @Override
    @ResponseBody
    public Address queryAddressById(@RequestParam("addressId") Integer addressId) {

        return drusMapper.queryAddressById(addressId);
    }

    /**
     * 查询商品管理
     * @return
     */
    @Override
    @ResponseBody
    public List<Commodity> querycommodityList(@RequestBody Commodity commodity) {
        return drusMapper.querycommodityList(commodity);
    }

    /**
     * 退货商品状态
     * @param returnId
     */
    @Override
    @ResponseBody
    public void countersign(@RequestParam("returnId") Integer returnId) {
        drusMapper.countersign(returnId);
    }

    /**
     * 新增商品管理数据
     * @param commodity
     */
    @Override
    @ResponseBody
    public void saveCommodity(@RequestBody Commodity commodity) {
        if(commodity.getId()==null){
            drusMapper.saveCommodity(commodity);
        }else{
            drusMapper.updateCommodity(commodity);
        }

    }

    /**
     * 删除商品管理
     * @param comId
     */
    @Override
    @ResponseBody
    public void delCommodityById(@RequestParam("comId") Integer comId) {
        drusMapper.delCommodityById(comId);
    }

    /**
     * 回显商品管理
     * @param comId
     * @return
     */
    @Override
    @ResponseBody
    public Commodity queryCommodityById(@RequestParam("comId") Integer comId) {
        return drusMapper.queryCommodityById(comId);
    }

    /**
     * 上下架
     * @param id
     * @param commoditystatus
     */
    @Override
    @ResponseBody
    public void upDownJia(@RequestParam("id") Integer id,@RequestParam("commoditystatus") Integer commoditystatus) {
        if(commoditystatus == 1){
            drusMapper.downCommodity(id);
        }else{
            drusMapper.updCommodity(id);
        }

    }

    /**
     * 批量上架
     * @param ids
     */
    @Override
    @ResponseBody
    public void batchShelves(@RequestParam("ids") Integer[] ids) {
        drusMapper.batchShelves(ids);
    }

    @Override
    @ResponseBody
    public void downShelf(@RequestParam("ids") Integer[] ids) {
        drusMapper.downShelf(ids);
    }


    /**
     * 缺药登记查询
     * @return
     */
    @Override
    @ResponseBody
    public List<ProductBuy> queryProductList() {

        return drusMapper.queryProductList();
    }
}
