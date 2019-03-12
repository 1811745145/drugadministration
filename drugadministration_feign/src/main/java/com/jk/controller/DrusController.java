package com.jk.controller;

import com.jk.ConstantUtils.ConstantUtil;
import com.jk.pojo.Address;
import com.jk.pojo.Commodity;
import com.jk.pojo.DrugNoReturn;
import com.jk.pojo.TreeBean;
import com.jk.service.DrusServicefeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class DrusController {
    @Autowired
    private DrusServicefeign drusServicefeign;
    @Autowired
    private RedisTemplate redisTemplate;
    /**
     * 批量上架
     */
    @RequestMapping("batchShelves")
    @ResponseBody
    public Boolean batchShelves(@RequestParam("ids") Integer[] ids){
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
    public Boolean downShelf(@RequestParam("ids") Integer[] ids){
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
    public Boolean upDownJia(@RequestParam("id") Integer id,@RequestParam("commoditystatus") Integer commoditystatus){
        try {
            drusServicefeign.upDownJia(id,commoditystatus);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    /**
     * 跳转医药查看页面
     * @return
     */
    @RequestMapping("PageDrugPurchase")
    public String PageDrugPurchase(){
        return "DrugPurchase/DrugPurchaseShow";
    }

    /**
     * 新增商品管理
     */
    @PostMapping("saveCommodity")
    @ResponseBody
    public Boolean saveCommodity(@RequestBody Commodity commodity){
        try {
            drusServicefeign.saveCommodity(commodity);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    /**
     * 查询商品管理
     */
    @RequestMapping("querycommodityList")
    @ResponseBody
    public List<Commodity> querycommodityList(Commodity commodity){

        return drusServicefeign.querycommodityList(commodity);
    }
    /**
     * 跳转商品管理页面
     */
    @RequestMapping("commodity")
    public String commodity(){
        return "commodity";
    }
    /**
     * 根据Id查询商品管理
     */
    @RequestMapping("queryCommodityById")
    @ResponseBody
    public Commodity queryCommodityById(@RequestParam("comId") Integer comId){
        return drusServicefeign.queryCommodityById(comId);
    }
    /**
     * 根据id查询  回显
     */
    @RequestMapping("queryAddressById")
    @ResponseBody
    public Address queryAddressById(@RequestParam("addressId")Integer addressId){
        return drusServicefeign.queryAddressById(addressId);
    }
    /**
     * 新增
     */
    @PostMapping("saveAddress")
    @ResponseBody
    public Boolean saveAddress(@RequestBody Address address){
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
     * @return
     */
    @RequestMapping("toaddAddress")
    public String addAddress(){
        return "addAddress";
    }

    /**
     * 根据Id删除商品管理数据
     */
    @DeleteMapping("delCommodityById")
    @ResponseBody
    public Boolean delCommodityById(@RequestParam("comId")Integer comId){
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
    public Boolean delById(@RequestParam("addressId") Integer addressId){
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
     * @return
     */
    @RequestMapping("show")
    public String show(){
        return "show";
    }

    /**
     * 查询主页面
     * @return
     */
    @RequestMapping("findTreeList")
    @ResponseBody
    public List<TreeBean> findTreeList(){

        return drusServicefeign.findTreeList();
    }
    /**
     * 跳转地址管理页面
     */
    @RequestMapping("address")
    public String address_(){
        return "address_management";
    }
    /**
     * 查询地址管理数据
     */
    @RequestMapping("queryaddressList")
    @ResponseBody
    public List<Address> queryaddressList(){
        //创建一个集合
        List<Address> list = new ArrayList<>();
        //定义一个常量
        String cacheKay = ConstantUtil.CACHE_ADDRESS_SELE;
        //判断key是否存在
        Boolean hasKey = redisTemplate.hasKey(cacheKay);
        if(hasKey){
            //如果存在则取出list集合
          list = (List<Address>) redisTemplate.opsForValue().get(cacheKay);
        }else{
            //不存在去数据库查询然后set到常量里面
          list = drusServicefeign.queryaddressList();
          redisTemplate.opsForValue().set(cacheKay,list);
          //设置过期时间
          redisTemplate.expire(cacheKay, 30, TimeUnit.MINUTES);
        }
        return list;
    }


    /**
     * 退货商品查询
     * @return
     */
    @GetMapping("returnList")
    @ResponseBody
    public List<DrugNoReturn> returnList(){

        return drusServicefeign.returnList();
    }

    /**
     * 退货商品查询跳页面
     * @return
     */
    @RequestMapping("toReturnList")
    public String toReturnList(){
        return "returnList";
    }

    /**
     * 退货商品状态
     * @return
     */
    @PostMapping("countersign")
    @ResponseBody
    public String countersign(@RequestParam("returnId") Integer returnId){
        drusServicefeign.countersign(returnId);
        return "1";
    }
    /**
     * 跳转商品管理发布商品页面
     */
    @RequestMapping("toAddcommodity")
    public String toAddcommodity(){
        return "addcommodity";
    }
}
