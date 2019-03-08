package com.jk.controller;

import com.jk.pojo.Address;
import com.jk.pojo.Commodity;
import com.jk.pojo.DrugNoReturn;
import com.jk.pojo.TreeBean;
import com.jk.service.DrusServicefeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DrusController {
    @Autowired
    private DrusServicefeign drusServicefeign;

    /**
     * 查询商品管理
     */
    @RequestMapping("querycommodityList")
    @ResponseBody
    public List<Commodity> querycommodityList(){
        return drusServicefeign.querycommodityList();
    }
    /**
     * 跳转商品管理页面
     */
    @RequestMapping("commodity")
    public String commodity(){
        return "commodity";
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
    public String saveAddress(@RequestBody Address address){
        drusServicefeign.saveAddress(address);
        return "1";
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
     * 根据id删除数据
     */
    @DeleteMapping("delById")
    @ResponseBody
    public String delById(@RequestParam("addressId") Integer addressId){
        drusServicefeign.delById(addressId);
        return "1";
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
        return drusServicefeign.queryaddressList();
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
}
