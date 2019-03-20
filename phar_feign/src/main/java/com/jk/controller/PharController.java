package com.jk.controller;

import com.jk.pojo.Tenterprise;
import com.jk.service.PharServiceFingn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: dru
 * @Date: 2019/3/19 20:12
 * @Author: Mr.Deng
 * @Description:
 */
@Controller
public class PharController {

    @Autowired
    private PharServiceFingn pharServiceFingn;

    /**
     * 上榜企业
     * @return
     */
    @GetMapping("pharList")
    @ResponseBody
    public List<Tenterprise> pharList(){

        return pharServiceFingn.pharList();
    }

    @RequestMapping("toList")
    public String toList(){
        return "pharQueryList";
    }

    /**
     * 知名企业
     * @return
     */
    @GetMapping("famousList")
    @ResponseBody
    public List<Tenterprise> famousList(){

        return pharServiceFingn.famousList();
    }

    @RequestMapping("toFamous")
    public String toFamous(){
        return "famousQueryList";
    }
    /**
     * 中西医药
     * @return
     */
    @GetMapping("chineseList")
    @ResponseBody
    public List<Tenterprise> chineseList(){

        return pharServiceFingn.chineseList();
    }

    @RequestMapping("toChinese")
    public String toChinese(){
        return "chineseQueryList";
    }
    /**
     * 医疗器械
     * @return
     */
    @GetMapping("medicalList")
    @ResponseBody
    public List<Tenterprise> medicalList(){

        return pharServiceFingn.medicalList();
    }

    @RequestMapping("toMedical")
    public String toMedical(){
        return "medicalQueryList";
    }
    /**
     * 滋补保健
     * @return
     */
    @GetMapping("nourishingList")
    @ResponseBody
    public List<Tenterprise> nourishingList(){

        return pharServiceFingn.nourishingList();
    }

    @RequestMapping("toNourishing")
    public String toNourishing(){
        return "nourishingQueryList";
    }
    /**
     * 成人用品
     * @return
     */
    @GetMapping("adultList")
    @ResponseBody
    public List<Tenterprise> adultList(){

        return pharServiceFingn.adultList();
    }

    @RequestMapping("toAdult")
    public String toAdult(){
        return "adultQueryList";
    }
    /**
     * 草药专区
     * @return
     */
    @GetMapping("herbList")
    @ResponseBody
    public List<Tenterprise> herbList(){

        return pharServiceFingn.herbList();
    }

    @RequestMapping("toHerb")
    public String toHerb(){
        return "herbQueryList";
    }
    /**
     * 日用商超
     * @return
     */
    @GetMapping("useList")
    @ResponseBody
    public List<Tenterprise> useList(){

        return pharServiceFingn.useList();
    }

    @RequestMapping("toUse")
    public String toUse(){
        return "useQueryList";
    }

}
