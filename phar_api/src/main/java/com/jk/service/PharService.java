package com.jk.service;

import com.jk.pojo.LoginPojo;
import com.jk.pojo.Tenterprise;
import com.jk.pojo.Tstore;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: dru
 * @Date: 2019/3/19 20:11
 * @Author: Mr.Deng
 * @Description:
 */
public interface PharService {

    /**
     * 上榜企业
     * @return
     */
    @GetMapping("pharList")
    List<Tenterprise> pharList();

    /**
     * 知名企业
     * @return
     */
    @GetMapping("famousList")
    List<Tenterprise> famousList();

    /**
     * 中西医药
     * @return
     */
    @GetMapping("chineseList")
    List<Tenterprise> chineseList();

    /**
     * 医疗器械
     * @return
     */
    @GetMapping("medicalList")
    List<Tenterprise> medicalList();

    /**
     * 滋补保健
     * @return
     */
    @GetMapping("nourishingList")
    List<Tenterprise> nourishingList();

    /**
     * 成人用品
     * @return
     */
    @GetMapping("adultList")
    List<Tenterprise> adultList();

    /**
     * 草药专区
     * @return
     */
    @GetMapping("herbList")
    List<Tenterprise> herbList();

    /**
     * 日用商超
     * @return
     */
    @GetMapping("useList")
    List<Tenterprise> useList();

    /**
     * 旗舰店
     * @return
     */
    @GetMapping("drugList")
    List<Tstore> drugList();

    /**
     * 汤药
     * @return
     */
    @GetMapping("tangYaoList")
    List<Tstore> tangYaoList();

    /**
     * 中成药
     * @return
     */
    @GetMapping("chinesePatentMedicineList")
    List<Tstore> chinesePatentMedicineList();

    /**
     * 中药
     * @return
     */
    @GetMapping("traditionalChineseMedicineList")
    List<Tstore> traditionalChineseMedicineList();

    /**
     * 西药
     * @return
     */
    @GetMapping("westernMedicineList")
    List<Tstore> westernMedicineList();



    @RequestMapping("findUserByName")
    LoginPojo findUserByName(LoginPojo loginPojo);



    /**
     * 商品详情根据ID查询
     * @return
     */
    @GetMapping("drugListById")
    Tstore drugListById(String storeId);
}
