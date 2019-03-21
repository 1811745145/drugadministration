package com.jk.mapper;

import com.jk.pojo.WebDrugBean;
import com.jk.pojo.WebTree;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicalHomeMapper {
    WebDrugBean selectCar(@Param("spid") Integer spid);

    List<WebDrugBean> selectDrupList();

    List<WebTree> selectTree1(@Param("pid") Integer pid);

    List<WebDrugBean> selectTjsp();
}
