package com.jk.service;

import com.jk.pojo.*;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    HashMap<String, Object> queryaddressList(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows);

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
    HashMap<String,Object> querycommodityList(Commodity commodity,@RequestParam("page") Integer page,@RequestParam("rows")Integer rows);
    /**
     * 退货商品状态
     * @return
     */
    @PostMapping("countersign")
    void countersign(@RequestParam("returnId") Integer returnId);

    /**
     * 缺药登记查询
     * @return
     */
    @GetMapping("queryProductList")
    List<ProductBuy> queryProductList();

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

    /**
     *发布缺药登记
     * @param productBuy
     */
    @PostMapping("addProduct")
    void addProduct(ProductBuy productBuy);

    @RequestMapping("queryProductuyBuy")
    ProductBuy queryProductuyBuy(@RequestParam("drug_Id") Integer drug_Id);

    @RequestMapping("delProductuyBuy")
    void delProductuyBuy(@RequestParam("id") Integer id);
    /**
     * 查询用户登录数据
     * @return
     */
    @RequestMapping("queryUserBySessionId")
    UserBean queryUserBySessionId();

    /**
     * 根据Id修改密码
     * @param userId
     * @param newPassword
     */
    @RequestMapping("updateUserBySessionId")
    void updateUserBySessionId(@RequestParam("userId") Integer userId,@RequestParam("newPassword") String newPassword);

    /**
     * 新增商品管理
     * @param investmentBean
     */
    @RequestMapping("investmentBean")
    void saveInvestment(InvestmentBean investmentBean);

    /**
     * 拆线呢商品管理
     * @param status
     * @return
     */
    @RequestMapping("selectInvestment")
    List<InvestmentBean> selectInvestment(@RequestParam("status")String status);

    /**
     * 删除商品管理
     * @param id
     */
    @DeleteMapping("deleteInvset")
    void deleteInvset(@RequestParam("id") Integer id);

    /**
     * 回显
     * @param id
     * @return
     */
    @RequestMapping("selectInvestmentById")
    InvestmentBean selectInvestmentById(@RequestParam("id") Integer id);
    /**
     * 批量上架
     * @param investmentBean
     */
    @RequestMapping("updateUpInvestment")
    void updateUpInvestment(InvestmentBean investmentBean);

    /**
     * 批量下架
     * @param investmentBean
     */
    @RequestMapping("updateDownInvestment")
    void updateDownInvestment(InvestmentBean investmentBean);

    /**
     * 查询地区
     * @param id
     * @return
     */
    @RequestMapping("findProvinceSelect")
    List<Area> findProvinceSelect(@RequestParam("id") Integer id);
}
