package com.jk.mapper;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DrusMapper {
    /**
     * 查询树
     * @param id
     * @return
     */
    @Select(" select * from purchase_centre_tree where pid = #{value} ")
    List<TreeBean> findTreeList(int id);

    /**
     * 查询地址管理列表
     * @return
     */
    @Select(" select * from addressmanagement ")
    List<Address> queryaddressList();

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
    List<Commodity> querycommodityList(Commodity commodity);

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
}
