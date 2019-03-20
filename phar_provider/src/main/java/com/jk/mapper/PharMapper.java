package com.jk.mapper;

import com.jk.pojo.Tenterprise;

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
}
