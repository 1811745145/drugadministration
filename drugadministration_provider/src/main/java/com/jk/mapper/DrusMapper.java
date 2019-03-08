package com.jk.mapper;

import com.jk.pojo.Commodity;
import com.jk.pojo.DrugNoReturn;
import com.jk.pojo.Address;
import com.jk.pojo.TreeBean;
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
    List<Commodity> querycommodityList();
}
