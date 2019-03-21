package com.jk.controller;

import com.jk.Contants.ContangUtils;
import com.jk.pojo.LoginPojo;
import com.jk.pojo.Tenterprise;
import com.jk.pojo.Tstore;
import com.jk.service.PharServiceFingn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

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




    /*跳转住页面*/
    @Autowired
    private RedisTemplate redisTemplate;

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


    /**
     * 旗舰店
     * @return
     */
    @GetMapping("drugList")
    @ResponseBody
    public List<Tstore> drugList(){

        return pharServiceFingn.drugList();
    }

    @RequestMapping("toDrug")
    public String toDrug(){
        return "drugList";
    }

    /**
     * 汤药
     * @return
     */
    @GetMapping("tangYaoList")
    @ResponseBody
    public List<Tstore> tangYaoList(){

        return pharServiceFingn.tangYaoList();
    }

    @RequestMapping("toTangYao")
    public String toTangYao(){
        return "tangYaoList";
    }

    /**
     * 中成药
     * @return
     */
    @GetMapping("chinesePatentMedicineList")
    @ResponseBody
    public List<Tstore> chinesePatentMedicineList(){

        return pharServiceFingn.chinesePatentMedicineList();
    }

    @RequestMapping("toChinesePatentMedicine")
    public String toChinesePatentMedicine(){
        return "chinesePatentMedicineList";
    }

    /**
     * 中药
     * @return
     */
    @GetMapping("traditionalChineseMedicineList")
    @ResponseBody
    public List<Tstore> traditionalChineseMedicineList(){

        return pharServiceFingn.traditionalChineseMedicineList();
    }

    @RequestMapping("toTraditionalChineseMedicine")
    public String toTraditionalChineseMedicine(){
        return "traditionalChineseMedicineList";
    }

    /**
     * 西药
     * @return
     */
    @GetMapping("westernMedicineList")
    @ResponseBody
    public List<Tstore> westernMedicineList(){

        return pharServiceFingn.westernMedicineList();
    }

    @RequestMapping("toWesternMedicine")
    public String toWesternMedicine(){
        return "westernMedicineList";
    }

    @RequestMapping("loginDrul")
    @ResponseBody
    public String loginDrul(LoginPojo loginPojo){
        LoginPojo userInfo = pharServiceFingn.findUserByName(loginPojo);
        String user = ContangUtils.CACHE_USER_LOGIN;
        if(userInfo == null){
            return "1";
        }
        if(!userInfo.getPassWord().equals(loginPojo.getPassWord())){
            return "2";
        }

        redisTemplate.opsForValue().set("user",userInfo);
        LoginPojo users = (LoginPojo) redisTemplate.opsForValue().get("user");
        System.out.println(users);
        return "0";

    }

    @RequestMapping("tiao")
    public String loginDrul(){
        return "loginDrul";
    }

}
