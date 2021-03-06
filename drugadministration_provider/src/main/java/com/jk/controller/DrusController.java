package com.jk.controller;

import com.jk.mapper.DrusMapper;
import com.jk.pojo.*;
import com.jk.service.DrusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    public HashMap<String, Object> queryaddressList(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows) {
        HashMap<String, Object> params = new HashMap<>();
        int count = drusMapper.queryaddressCount();
        //分页查询
        int start = (page-1)*rows;//开始条数
        List<Address> list = drusMapper.queryaddressList(start,rows);
        params.put("total", count);
        params.put("rows", list);
        return params;
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
    public HashMap<String,Object> querycommodityList(@RequestBody Commodity commodity,@RequestParam("page") Integer page,@RequestParam("rows")Integer rows) {
        HashMap<String, Object> params = new HashMap<>();
        int count = drusMapper.querycommodityCount(commodity);
        //分页查询
        int start = (page-1)*rows;//开始条数
        List<Commodity> list = drusMapper.querycommodityList(commodity,start,rows);
        params.put("total", count);
        params.put("rows", list);
        return params;
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
     * 查询原始密码
     * @param session
     * @return
     */
    @Override
    @ResponseBody
    public UserBean queryUserBySessionId() {

        return drusMapper.queryUserBySessionId();
    }

    /**
     * 修改密码
     * @param userId
     * @param newPassword
     */
    @Override
    @ResponseBody
    public void updateUserBySessionId(@RequestParam("userId") Integer userId,@RequestParam("newPassword")String newPassword) {
        drusMapper.updateUserBySessionId(userId,newPassword);
    }

    /**
     * 新增招商数据
     * @param investmentBean
     */
    @Override
    @ResponseBody
    public void saveInvestment(@RequestBody InvestmentBean investmentBean) {
        investmentBean.setStatus("1");
        drusMapper.saveInvestment(investmentBean);
    }

    /**
     * 查询招商信息
     * @param status
     * @return
     */
    @Override
    @ResponseBody
    public List<InvestmentBean> selectInvestment(@RequestParam("status")String status) {

        return drusMapper.selectInvestment(status);
    }

    /**
     * 删除招商信息
     * @param id
     */
    @Override
    @ResponseBody
    public void deleteInvset(@RequestParam("id") Integer id) {
        drusMapper.deleteInvset(id);
    }

    /**
     * 回显
     * @param id
     * @return
     */
    @Override
    @ResponseBody
    public InvestmentBean selectInvestmentById(@RequestParam("id") Integer id) {
        return drusMapper.selectInvestmentById(id);
    }

    /**
     * 批量上架
     * @param investmentBean
     */
    @Override
    @ResponseBody
    public void updateUpInvestment(@RequestBody InvestmentBean investmentBean) {
        drusMapper.updateUpInvestment(investmentBean);
    }

    /**
     * 批量下架
     * @param investmentBean
     */
    @Override
    @ResponseBody
    public void updateDownInvestment(@RequestBody InvestmentBean investmentBean) {
        drusMapper.updateDownInvestment(investmentBean);
    }

    @Override
    @ResponseBody
    public List<Area> findProvinceSelect(@RequestParam("id") Integer id) {
        return drusMapper.findProvinceSelect(id);
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

    /**
     * 发布缺药登记
     * @return
     */
    @Override
    @ResponseBody
    public void addProduct(@RequestBody ProductBuy productBuy) {
        if (productBuy.getDrug_Id()==null) {
            drusMapper.addProduct(productBuy);
        } else {
            drusMapper.updeteProductuyBuy(productBuy);
        }
    }

    /**
     * 回显发布缺药登记
     * @param drug_Id
     * @return
     */
    @Override
    @ResponseBody
    public ProductBuy queryProductuyBuy(@RequestParam("drug_Id") Integer drug_Id) {
        return drusMapper.queryProductuyBuy(drug_Id);
    }

    @Override
    @ResponseBody
    public void delProductuyBuy(@RequestParam("id") Integer id) {
        drusMapper.delProductuyBuy(id);
    }
}
