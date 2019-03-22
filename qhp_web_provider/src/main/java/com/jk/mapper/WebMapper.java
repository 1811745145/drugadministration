package com.jk.mapper;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WebMapper {

    @Select(" select * from t_shoping ")
    List<ShoPing> findshopingList();

    @Select(" select * from t_dianpu ")
    List<DianPu> findDianPu();

    int queryCount(@Param("daili") Daili daili);

    List<Daili> findUserList(@Param("daili")Daili daili,@Param("start") int start, @Param("rows") Integer rows);

    @Select(" select * from t_fenlei where pid = #{value} ")
    List<Fenlei> findYijiSelect(Integer id);


    int findGongyingCount(@Param("gongying")Gongying gongying);

    List<Gongying> findGongyingList(@Param("gongying") Gongying gongying,@Param("start") int start, @Param("rows") Integer rows);

    int findQiuGouCount(@Param("qiuGou")QiuGou qiuGou);

    List<Gongying> findQiuGouList(@Param("qiuGou")QiuGou qiuGou,@Param("start") int start,@Param("rows") Integer rows);

    @Insert(" insert into t_user(userName,userPassword,email)values(#{userName},#{userPassword},#{email})  ")
    void regSave(UserBean userBean);

    @Select(" select * from t_user where userName = #{value}  ")
    UserBean findUserByName(String userName);
}
