package com.jk.mapper;

import com.jk.pojo.Address;
import com.jk.pojo.TreeBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DrusMapper {
    @Select(" select * from purchase_centre_tree where pid = #{value} ")
    List<TreeBean> findTreeList(int id);

    @Select(" select * from addressmanagement ")
    List<Address> queryaddressList();

    @Delete(" delete from addressmanagement where address_Id = #{value} ")
    void delById(Integer addressId);
}
