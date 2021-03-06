package com.jk.controller;

import com.jk.mapper.PharMapper;
import com.jk.pojo.LoginPojo;
import com.jk.pojo.Tenterprise;
import com.jk.pojo.Tstore;
import com.jk.service.PharService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: dru
 * @Date: 2019/3/19 20:12
 * @Author: Mr.Deng
 * @Description:
 */
@Controller
public class PharController implements PharService {

    @Autowired
    private PharMapper pharMapper;

    /**
     * 上榜企业
     * @return
     */
    @Override
    @ResponseBody
    public List<Tenterprise> pharList() {
        return pharMapper.pharList();
    }

    /**
     * 知名企业
     * @return
     */
    @Override
    @ResponseBody
    public List<Tenterprise> famousList() {
        return pharMapper.famousList();
    }

    /**
     * 中西医药
     * @return
     */
    @Override
    @ResponseBody
    public List<Tenterprise> chineseList() {
        return pharMapper.chineseList();
    }

    /**
     * 医疗器械
     * @return
     */
    @Override
    @ResponseBody
    public List<Tenterprise> medicalList() {
        return pharMapper.medicalList();
    }

    /**
     * 滋补保健
     * @return
     */
    @Override
    @ResponseBody
    public List<Tenterprise> nourishingList() {
        return pharMapper.nourishingList();
    }

    /**
     * 成人用品
     * @return
     */
    @Override
    @ResponseBody
    public List<Tenterprise> adultList() {
        return pharMapper.adultList();
    }

    /**
     * 草药专区
     * @return
     */
    @Override
    @ResponseBody
    public List<Tenterprise> herbList() {
        return pharMapper.herbList();
    }

    /**
     * 日用商超
     * @return
     */
    @Override
    @ResponseBody
    public List<Tenterprise> useList() {
        return pharMapper.useList();
    }

    /**
     * 旗舰店
     * @return
     */
    @Override
    @ResponseBody
    public List<Tstore> drugList() {
        return pharMapper.drugList();
    }

    /**
     * 汤药
     * @return
     */
    @Override
    @ResponseBody
    public List<Tstore> tangYaoList() {
        return pharMapper.tangYaoList();
    }

    /**
     * 中成药
     * @return
     */
    @Override
    @ResponseBody
    public List<Tstore> chinesePatentMedicineList() {
        return pharMapper.chinesePatentMedicineList();
    }

    /**
     * 中药
     * @return
     */
    @Override
    @ResponseBody
    public List<Tstore> traditionalChineseMedicineList() {
        return pharMapper.traditionalChineseMedicineList();
    }

    /**
     * 西药
     * @return
     */
    @Override
    @ResponseBody
    public List<Tstore> westernMedicineList() {
        return pharMapper.westernMedicineList();
    }



    @Override
    @ResponseBody
    public LoginPojo findUserByName(@RequestBody LoginPojo loginPojo) {


        return pharMapper.findUserByName(loginPojo.getUserName());
    }

    @Override
    @ResponseBody
    public Tstore drugListById(@RequestBody String storeId) {
        return pharMapper.drugListById(storeId);
    }
}
