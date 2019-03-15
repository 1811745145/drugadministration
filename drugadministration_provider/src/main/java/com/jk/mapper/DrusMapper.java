package com.jk.mapper;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface DrusMapper {
    /**
     * 查询树
     * @param
     * @return
     */
    @Select(" select * from purchase_centre_tree where pid = #{value} ")
    List<TreeBean> findTreeList(int id);

    /**
     * 查询地址管理列表
     * @return
     */
    int queryaddressCount();


    List<Address> queryaddressList(@Param("start") int start,@Param("rows") Integer rows);
    /**
     * 根据id删除
     * @param addressId
     */
    @Delete(" delete from addressmanagement where address_Id = #{value} ")
    void delById(Integer addressId);

    /**
     * 新增
     * @param address
     */
    @Insert(" insert into addressmanagement(address_name,address_area,detailedaddress,zipcode,phone)values(#{address_name},#{address_area},#{detailedaddress},#{zipcode},#{phone}) ")
    void saveAddress(Address address);

    /**
     * 退货商品查询
     * @return
     */
    List<DrugNoReturn> returnList();

    /**
     * 退货商品状态
     * @param returnId
     */
    void countersign(Integer returnId);

    /**
     * 修改根据id
     * @param address
     */
    @Update(" update addressmanagement set address_name = #{address_name},address_area = #{address_area},detailedaddress = #{detailedaddress},zipcode = #{zipcode},phone = #{phone} where address_Id = #{address_Id} ")
    void updateAddress(Address address);

    /**
     * 根据id查询   回显
     * @param addressId
     * @return
     */
    @Select(" select * from addressmanagement where address_Id = #{value} ")
    Address queryAddressById(Integer addressId);

    /**
     * 查询商品管理
     * @return
     */
    List<Commodity> querycommodityList(@Param("commodity") Commodity commodity,@Param("start") int start,@Param("rows") Integer rows);

    /**
     * 新增商品管理数据
     * @param commodity
     */
    @Insert(" insert into commodity(commodityname,commoditynumber,commodityspecifications,manufacturefactory,approvalnumber,supplyprice,commoditystock,releasetime,commoditystatus,auditstatus)values(#{commodityname},#{commoditynumber},#{commodityspecifications},#{manufacturefactory},#{approvalnumber},#{supplyprice},#{commoditystock},#{releasetime},#{commoditystatus},#{auditstatus}) ")
    void saveCommodity(Commodity commodity);

    /**
     * 删除商品管理
     * @param comId
     */
    @Delete(" delete from commodity where id = #{value} ")
    void delCommodityById(Integer comId);

    /**
     * 回显商品管理
     * @param comId
     * @return
     */
    @Select(" select * from commodity where id = #{value} ")
    Commodity queryCommodityById(Integer comId);

    /**
     * 修改商品管理
     * @param commodity
     */
    @Update(" update commodity set commodityname = #{commodityname},commoditynumber = #{commoditynumber},commodityspecifications = #{commodityspecifications},manufacturefactory = #{manufacturefactory},approvalnumber = #{approvalnumber},supplyprice = #{supplyprice},commoditystock = #{commoditystock},releasetime = #{releasetime},commoditystatus = #{commoditystatus},auditstatus = #{auditstatus} where id = #{id} ")
    void updateCommodity(Commodity commodity);

    /**
     * 下架
     * @param id
     */
    @Update(" update commodity set commoditystatus = 2  where id = #{value}")
    void downCommodity(Integer id);

    /**
     * 上架
     * @param id
     */
    @Update(" update commodity set commoditystatus = 1  where id = #{value}")
    void updCommodity(Integer id);

    /**
     * 批量上架
     * @param ids
     */
    void batchShelves(Integer[] ids);

    /**
     * 批量下架
     * @param ids
     */
    void downShelf(Integer[] ids);
    List<Commodity> querycommodityList();

    /**
     * 缺药登记查询
     * @return
     */
    List<ProductBuy> queryProductList();

    /**
     * 根据Id查询用户信息
     * @return
     */
    @Select(" select * from t_user where userId = 1 ")
    UserBean queryUserBySessionId();

    /**
     * 根据Id新修改用户密码
     * @param userId
     * @param newPassword
     */
    void updateUserBySessionId(@Param("userId") Integer userId, @Param("newPassword") String newPassword);

    /**
     * 发布缺药登记
     * @return
     */
    void addProduct(ProductBuy productBuy);

    /**
     * 回显发布缺药登记
     * @param drug_Id
     * @return
     */
    ProductBuy queryProductuyBuy(Integer drug_Id);

    /**
     * 修改发布缺药登记
     * @param productBuy
     * @return
     */
    void updeteProductuyBuy(ProductBuy productBuy);

    void delProductuyBuy(Integer drug_Id);

    //保存招商
    @Insert("insert into t_investment(investmentTitle,investmentClass,expirationDate,investmentRegion,investmentAmount,depositRequired,investmentName,investmentSpecifications, medicineQuasiCharacter,manufacturer,drugNumber,pieceCount,trademark,medicalType,drugList,investmentInfo,status)values(#{investmentTitle},#{investmentClass},#{expirationDate}, #{investmentRegion},#{investmentAmount},#{depositRequired},#{investmentName},#{investmentSpecifications},#{medicineQuasiCharacter},#{manufacturer},#{drugNumber},#{pieceCount},#{trademark},#{medicalType},#{drugList},#{investmentInfo},#{status})")
    void saveInvestment(InvestmentBean investmentBean);

    //查询招商
    @Select(" select * from  t_investment where status = #{value}")
    List<InvestmentBean> selectInvestment(String status);

    /**
     * 删除招商信息
     * @param id
     */
    @Delete(" delete from t_investment where id = #{value} ")
    void deleteInvset(Integer id);

    /**
     * 回显招商信息
     * @param id
     * @return
     */
    @Select(" select * from  t_investment where id = #{value}")
    InvestmentBean selectInvestmentById(Integer id);

    /**
     * 批量上架
     * @param investmentBean
     */
    @Update(" update t_investment set investmentClass = #{investmentClass},investmentTitle = #{investmentTitle},investmentRegion = #{investmentRegion},investmentName = #{investmentName},investmentInfo = #{investmentInfo},status = 0 where id = #{id} ")
    void updateUpInvestment(InvestmentBean investmentBean);

    /**
     * 批量下架
     * @param investmentBean
     */
    @Update(" update t_investment set investmentClass = #{investmentClass},investmentTitle = #{investmentTitle},investmentRegion = #{investmentRegion},investmentName = #{investmentName},investmentInfo = #{investmentInfo},status = 2 where id = #{id} ")
    void updateDownInvestment(InvestmentBean investmentBean);

    /**
     * 查询地区
     * @param id
     * @return
     */
    @Select(" select * from t_area where pid = #{id} ")
    List<Area> findProvinceSelect(Integer id);



    int querycommodityCount(@Param("commodity") Commodity commodity);
}
