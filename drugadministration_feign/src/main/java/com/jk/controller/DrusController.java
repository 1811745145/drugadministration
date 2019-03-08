package com.jk.controller;

import com.jk.pojo.Address;
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
     * 根据id删除数据
     */
    @DeleteMapping("delById")
    @ResponseBody
    public void delById(@RequestParam("addressId") Integer addressId){
        drusServicefeign.delById(addressId);
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
}
