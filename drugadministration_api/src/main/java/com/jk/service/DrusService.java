package com.jk.service;

import com.jk.pojo.Address;
import com.jk.pojo.DrugNoReturn;
import com.jk.pojo.TreeBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("drus")
public interface DrusService {
    @RequestMapping("findTreeList")
    List<TreeBean> findTreeList();

    @RequestMapping("queryaddressList")
    List<Address> queryaddressList();

    @DeleteMapping("delById")
    void delById(@RequestParam("addressId") Integer addressId);

    /**
     * 退货商品查询
     * @return
     */
    @GetMapping("returnList")
    List<DrugNoReturn> returnList();

}
