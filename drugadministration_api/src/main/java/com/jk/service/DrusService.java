package com.jk.service;

import com.jk.pojo.Address;
import com.jk.pojo.Commodity;
import com.jk.pojo.DrugNoReturn;
import com.jk.pojo.TreeBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("drus")
public interface DrusService {
    /**
     * 查询左侧树
     * @return
     */
    @RequestMapping("findTreeList")
    List<TreeBean> findTreeList();

    /**
     * 查询地址管理
     * @return
     */
    @RequestMapping("queryaddressList")
    List<Address> queryaddressList();

    /**
     * 根据id删除数据
     * @param addressId
     */
    @DeleteMapping("delById")
    void delById(@RequestParam("addressId") Integer addressId);

    /**
     * 新增地址管理数据
     * @param address
     */
    @PostMapping("saveAddress")
    void saveAddress(Address address);

    /**
     * 退货商品查询
     * @return
     */
    @GetMapping("returnList")
    List<DrugNoReturn> returnList();

    /**
     * 根据id查询
     * @param addressId
     * @return
     */
    @RequestMapping("queryAddressById")
    Address queryAddressById(@RequestParam("addressId")Integer addressId);

    /**
     * 查看商品管理系统数据
     * @return
     */
    @RequestMapping("querycommodityList")
    List<Commodity> querycommodityList(Commodity commodity);
    /**
     * 退货商品状态
     * @return
     */
    @PostMapping("countersign")
    void countersign(@RequestParam("returnId") Integer returnId);

    /**
     * 新增商品管理数据
     * @param commodity
     */
    @PostMapping("saveCommodity")
    void saveCommodity(Commodity commodity);

    /**
     * 删除商品管理
     * @param comId
     */
    @DeleteMapping("delCommodityById")
    void delCommodityById(@RequestParam("comId") Integer comId);

    /**
     * 根据Id查询商品管理
     * @param comId
     * @return
     */
    @RequestMapping("queryCommodityById")
    Commodity queryCommodityById(@RequestParam("comId") Integer comId);

    /**
     * 上下架
     * @param id
     * @param commoditystatus
     */
    @RequestMapping("upDownJia")
    void upDownJia(@RequestParam("id") Integer id,@RequestParam("commoditystatus") Integer commoditystatus);

    /**
     * 批量上架
     * @param ids
     */
    @RequestMapping("batchShelves")
    void batchShelves(@RequestParam("ids") Integer[] ids);

    /**
     * 批量下架
     * @param ids
     */
    @RequestMapping("downShelf")
    void downShelf(@RequestParam("ids") Integer[] ids);
}
