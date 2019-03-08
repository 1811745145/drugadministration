package com.jk.service;

import com.jk.pojo.Address;
import com.jk.pojo.Commodity;
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

    @PostMapping("saveAddress")
    void saveAddress(Address address);

    /**
     * 退货商品查询
     * @return
     */
    @GetMapping("returnList")
    List<DrugNoReturn> returnList();

    @RequestMapping("queryAddressById")
    Address queryAddressById(@RequestParam("addressId")Integer addressId);

    @RequestMapping("querycommodityList")
    List<Commodity> querycommodityList();
    /**
     * 退货商品状态
     * @return
     */
    @PostMapping("countersign")
    void countersign(@RequestParam("returnId") Integer returnId);
}
