package com.jk.mapper;

import com.jk.pojo.LoginPojo;
import com.jk.pojo.Tenterprise;
import com.jk.pojo.Tstore;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: dru
 * @Date: 2019/3/19 20:16
 * @Author: Mr.Deng
 * @Description:
 */
public interface PharMapper {

    List<Tenterprise> pharList();

    List<Tenterprise> famousList();

    List<Tenterprise> chineseList();

    List<Tenterprise> medicalList();

    List<Tenterprise> nourishingList();

    List<Tenterprise> adultList();

    List<Tenterprise> herbList();

    List<Tenterprise> useList();

    List<Tstore> drugList();

    List<Tstore> tangYaoList();

    List<Tstore> chinesePatentMedicineList();

    List<Tstore> traditionalChineseMedicineList();

    List<Tstore> westernMedicineList();

    @Select("  select * from t_user where userName = #{value} ")
    LoginPojo findUserByName(String userName);
}
