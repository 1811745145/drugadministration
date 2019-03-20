package com.jk.controller;

import com.jk.pojo.*;
import com.jk.ConstantUtils.ConstantUtil;
import com.jk.pojo.Address;
import com.jk.pojo.Commodity;
import com.jk.pojo.DrugNoReturn;
import com.jk.pojo.TreeBean;
import com.jk.service.DrusServicefeign;
import feign.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class DrusController {
    @Autowired
    private DrusServicefeign drusServicefeign;

    @Autowired
    private RedisTemplate redisTemplate;


    /**
     * 编辑不通过
     */
    @RequestMapping("updateDownInvestment")
    @ResponseBody
    public Boolean updateDownInvestment(@RequestBody InvestmentBean investmentBean) {
        try {
            drusServicefeign.updateDownInvestment(investmentBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 编辑通过
     */
    @RequestMapping("updateUpInvestment")
    @ResponseBody
    public Boolean updateUpInvestment(@RequestBody InvestmentBean investmentBean) {
        try {
            drusServicefeign.updateUpInvestment(investmentBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 回显招商数据
     */
    @RequestMapping("selectInvestmentById")
    @ResponseBody
    public InvestmentBean selectInvestmentById(@RequestParam("id") Integer id) {
        return drusServicefeign.selectInvestmentById(id);
    }

    /**
     * 跳转招商信息编辑页面
     *
     * @return
     */
    @RequestMapping("toUpdateInvestment")
    public String toUpdateInvestment() {
        return "updateInvestment";
    }

    /**
     * 删除商品信息
     */
    @DeleteMapping("deleteInvset")
    @ResponseBody
    public Boolean deleteInvset(@RequestParam("id") Integer id) {
        try {
            drusServicefeign.deleteInvset(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 查询招商信息
     */
    @RequestMapping("selectInvestment")
    @ResponseBody
    public List<InvestmentBean> selectInvestment(@RequestParam("status") String status) {
        return drusServicefeign.selectInvestment(status);
    }

    /**
     * 跳转招商页面
     */
    @RequestMapping("add")
    public String add() {
        return "add";
    }

    @RequestMapping("toAdd")
    public String toAdd() {
        return "adds";
    }

    /**
     * 新增商品信息
     */
    @RequestMapping("saveInvestment")
    @ResponseBody
    public Boolean saveInvestment(@RequestBody InvestmentBean investmentBean) {
        try {
            drusServicefeign.saveInvestment(investmentBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 根据Id修改密码
     */
    @RequestMapping("updateUserBySessionId")
    @ResponseBody
    public Boolean updateUserBySessionId(@RequestParam("userId") Integer userId, @RequestParam("newPassword") String newPassword) {
        try {
            drusServicefeign.updateUserBySessionId(userId, newPassword);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 查看登录用户原始密码
     */
    @RequestMapping("queryUserBySessionId")
    @ResponseBody
    public UserBean queryUserBySessionId() {
        UserBean userBean = drusServicefeign.queryUserBySessionId();
        return userBean;
    }

    /**
     * 跳转修改密码页面
     */
    @RequestMapping("changePassword")
    public String changePassword() {
        return "securitySetting/changePassword";
    }

    /**
     * 批量上架
     */
    @RequestMapping("batchShelves")
    @ResponseBody
    public Boolean batchShelves(@RequestParam("ids") Integer[] ids) {
        try {
            drusServicefeign.batchShelves(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 批量下架
     */
    @RequestMapping("downShelf")
    @ResponseBody
    public Boolean downShelf(@RequestParam("ids") Integer[] ids) {
        try {
            drusServicefeign.downShelf(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 上下架
     */
    @RequestMapping("upDownJia")
    @ResponseBody
    public Boolean upDownJia(@RequestParam("id") Integer id, @RequestParam("commoditystatus") Integer commoditystatus) {
        try {
            drusServicefeign.upDownJia(id, commoditystatus);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 跳转医药查看页面
     *
     * @return
     */
    @RequestMapping("PageDrugPurchase")
    public String PageDrugPurchase() {
        return "DrugPurchaseShow";
    }

    /**
     * 新增商品管理
     */
    @PostMapping("saveCommodity")
    @ResponseBody
    public Boolean saveCommodity(@RequestBody Commodity commodity) {
        try {
            drusServicefeign.saveCommodity(commodity);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }



    /**
     * 跳转商品管理页面
     */
    @RequestMapping("commodity")
    public String commodity() {
        return "commodity";
    }

    /**
     * 根据Id查询商品管理
     */
    @RequestMapping("queryCommodityById")
    @ResponseBody
    public Commodity queryCommodityById(@RequestParam("comId") Integer comId) {
        return drusServicefeign.queryCommodityById(comId);
    }

    /**
     * 根据id查询  回显
     */
    @RequestMapping("queryAddressById")
    @ResponseBody
    public Address queryAddressById(@RequestParam("addressId") Integer addressId) {
        return drusServicefeign.queryAddressById(addressId);
    }

    /**
     * 新增
     */
    @PostMapping("saveAddress")
    @ResponseBody
    public Boolean saveAddress(@RequestBody Address address) {
        try {
            drusServicefeign.saveAddress(address);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 跳转新增页面
     *
     * @return
     */
    @RequestMapping("toaddAddress")
    public String addAddress() {
        return "addAddress";
    }

    /**
     * 根据Id删除商品管理数据
     */
    @DeleteMapping("delCommodityById")
    @ResponseBody
    public Boolean delCommodityById(@RequestParam("comId") Integer comId) {
        try {
            drusServicefeign.delCommodityById(comId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 根据id删除地址管理数据
     */
    @DeleteMapping("delById")
    @ResponseBody
    public Boolean delById(@RequestParam("addressId") Integer addressId) {
        try {
            drusServicefeign.delById(addressId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 跳转主页面
     *
     * @return
     */
    @RequestMapping("show")
    public String show() {
        return "show";
    }

    /**
     * 查询主页面
     *
     * @return
     */
    @RequestMapping("findTreeList")
    @ResponseBody
    public List<TreeBean> findTreeList() {

        return drusServicefeign.findTreeList();
    }

    /**
     * 跳转地址管理页面
     */
    @RequestMapping("address")
    public String address_() {
        return "address_management";
    }



    /**
     * 退货商品查询
     *
     * @return
     */
    @GetMapping("returnList")
    @ResponseBody
    public List<DrugNoReturn> returnList() {

        return drusServicefeign.returnList();
    }

    /**
     * 退货商品查询跳页面
     *
     * @return
     */
    @RequestMapping("toReturnList")
    public String toReturnList() {
        return "returnList";
    }

    /**
     * 退货商品状态
     *
     * @return
     */
    @PostMapping("countersign")
    @ResponseBody
    public String countersign(@RequestParam("returnId") Integer returnId) {
        drusServicefeign.countersign(returnId);
        return "1";
    }

    /**
     * 跳转商品管理发布商品页面
     */
    @RequestMapping("toAddcommodity")
    public String toAddcommodity() {
        return "addcommodity";
    }

    /**
     * 缺药登记查询
     * redis缓存
     *
     * @return
     */
    @GetMapping("queryProductList")
    @ResponseBody
    public List<ProductBuy> queryProductList() {
        /*return drusServicefeign.queryProductList();*/

        //创建一个集合
        List<ProductBuy> list = new ArrayList<>();
        //定义一个常量
        String product = ConstantUtil.CACHE_ADDRESS_SELE;
        //判断key是否存在
        Boolean hasKey = redisTemplate.hasKey(product);
        if (hasKey) {
            //如果存在则取出list集合
            list = (List<ProductBuy>) redisTemplate.opsForValue().get(product);
        } else {
            //不存在去数据库查询然后set到常量里面
            list = drusServicefeign.queryProductList();
            redisTemplate.opsForValue().set(product, list);
            //设置过期时间
            redisTemplate.expire(product, 30, TimeUnit.MINUTES);
        }
        return list;
    }

    /**
     * 缺药登记查询跳页面
     *
     * @return
     */
    @RequestMapping("toDrugList")
    public String toDrugList() {
        return "productuyBuyList";
    }

    /**
     * 发布缺药登记 没id是新增 有id是修改
     *
     * @return
     */
    @PostMapping("addProduct")
    @ResponseBody
    public Boolean addProduct(@RequestBody ProductBuy productBuy) {
        try {
            drusServicefeign.addProduct(productBuy);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 发布缺药登记跳页面
     *
     * @return
     */
    @RequestMapping("toAddProductuyBuy")
    public String toAddProductuyBuy() {
        return "addProductuyBuy";
    }

    /**
     * 发布缺药登记 根据id查询 回显
     */
    @RequestMapping("queryProductuyBuy")
    @ResponseBody
    public ProductBuy queryProductuyBuy(@RequestParam("drug_Id") Integer drug_Id) {
        return drusServicefeign.queryProductuyBuy(drug_Id);
    }

    /**
     * 根据Id删除缺药登记数据
     */
    @RequestMapping("delProductuyBuy")
    @ResponseBody
    public Boolean delProductuyBuy(@RequestParam("id") Integer id) {
        try {
            drusServicefeign.delProductuyBuy(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    @RequestMapping("queryaddressList")
    @ResponseBody
    public HashMap<String,Object>queryaddressList(@Param("page") Integer page,@Param("rows") Integer rows){
        return drusServicefeign.queryaddressList(page,rows);
    }

    @RequestMapping("querycommodityList")
    @ResponseBody
    public HashMap<String,Object>querycommodityList(Commodity commodity,@Param("page") Integer page,@Param("rows") Integer rows){
        return drusServicefeign.querycommodityList(commodity,page,rows);
    }


    @RequestMapping("findProvinceSelect")
    @ResponseBody
    public List<Area>findProvinceSelect(@RequestParam("id")Integer id){
        return drusServicefeign.findProvinceSelect(id);
    }
    /*跳转购物车*/
    @RequestMapping("theShoppingCart")
    public String theShoppingCart() {
        return "theShoppingCart";
    }

    /*跳转采购页面*/
    @RequestMapping("queryPurchaseOrderList")
    public String queryPurchaseOrderList() {
        return "queryPurchaseOrderList";
    }

    /**
     * 跳转退货管理（徐飞）
     */
    @RequestMapping("toReturn")
    public String toReturn() {
        return "returnList1";
    }

    /**
     * 跳转发货查询（徐飞）
     */
    @RequestMapping("toDeliver")
    public String toDeliver() {
        return "deliverList";
    }

    /**
     * 跳转发票列表（徐飞）
     */
    @RequestMapping("toInvoice")
    public String toInvoice() {
        return "invoiceList";
    }

    /**
     * 跳转销售订单（徐飞）
     */
    @RequestMapping("toSales")
    public String toSales() {
        return "salesList";
    }

    /**
     * 跳转店铺设置（徐飞）
     */
    @RequestMapping("toStore")
    public String toStore(){
        return "storeList";
    }

    /**
     * 跳转新增
     */
    @RequestMapping("addStore")
    public String addStore() {
        return "addStore";
    }

}
