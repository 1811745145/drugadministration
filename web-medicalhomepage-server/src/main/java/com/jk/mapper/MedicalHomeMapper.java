package com.jk.mapper;

import com.jk.pojo.UserBean;
import com.jk.pojo.WebDirectorFigure;
import com.jk.pojo.WebDrugBean;
import com.jk.pojo.WebTree;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MedicalHomeMapper {
    WebDrugBean selectCar(@Param("spid") Integer spid);

    List<WebDrugBean> selectDrupList();

    List<WebTree> selectTree1(@Param("pid") Integer pid);

    List<WebDrugBean> selectTjsp();

    List<WebDirectorFigure> selectDirectorFigure();

    Integer selectzhongxiyaocount(@Param("webDrugBean")WebDrugBean webDrugBean);

    List<WebDrugBean> selectzhongxiyao(@Param("start") int start,@Param("rows")Integer rows,@Param("webDrugBean") WebDrugBean webDrugBean);

    List<WebDrugBean> selectTj5();

    @Select("select * from t_web_drug where id = #{ids}")
    WebDrugBean queryDrugBeanById(Integer ids);

    @Select(" select * from t_user where userName = #{value}  ")
    UserBean findUserByName(String userName);
}
