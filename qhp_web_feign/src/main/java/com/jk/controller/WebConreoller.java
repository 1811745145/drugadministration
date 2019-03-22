package com.jk.controller;

import com.jk.config.ConstantUtil;
import com.jk.config.HttpClientUtil;
import com.jk.config.Md5Util;
import com.jk.pojo.*;
import com.jk.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class WebConreoller {
    @Autowired
    private WebService webService;
    @Autowired
    private RedisTemplate redisTemplate;

    //注册
    @RequestMapping("regSave")
    @ResponseBody
    public Boolean regSave(Integer yzm,UserBean userBean){
        String urlkey = ConstantUtil.REG_DRUG_CODE;
        Integer object = (Integer) redisTemplate.opsForValue().get(urlkey);
        if(!object.equals(yzm)) {
            return false;
        }
        webService.regSave(userBean);
        return true;
    }



    //获取验证码
    @RequestMapping("regDrul")
    @ResponseBody
    public String getMsgCode(String photo) {
        System.out.println(photo);
            //生成一个六位的随机数
            HashMap<String, Object> params = new HashMap<>();
            Integer code = (int) (Math.ceil(Math.random()*899999)+100000);
            //随机数加到HashMap中
            params.put("param", code);
            //id
            params.put("accountSid", "b5addf7908ec4db4ad8e09e6b617cd7e");
            //发送的手机号
            params.put("to", photo);
            //模板id
            params.put("templateid", "1288509396");
            //加时间戳
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String time = sdf.format(new Date());
            params.put("timestamp", time);
            //	ACCOUNT SID //必须加MD532位加密                                           AUTH TOKEN                       时间戳
            String qianming = "b5addf7908ec4db4ad8e09e6b617cd7e"+"7e9625b2bf7045de873fa43ebf7903f7"+time;
            String md532 = Md5Util.getMd532(qianming);
            //签名加入HashMap中
            params.put("sig", md532);
            String post = HttpClientUtil.post("https://api.miaodiyun.com/20150822/industrySMS/sendSMS", params);
            System.out.println(post);
            System.out.println(code);
            String urlkey = ConstantUtil.REG_DRUG_CODE;
            redisTemplate.opsForValue().set(urlkey,code);
            System.out.println("存缓存");
            //设置过期时间分钟
            redisTemplate.expire(urlkey, 10, TimeUnit.MINUTES);
            return "成功";
    }

    //供应商
    @RequestMapping("findGongyingList")
    @ResponseBody
    public HashMap<String,Object>findGongyingList(Gongying gongying, @RequestParam("page")Integer page, @RequestParam("rows")Integer rows){
        return webService.findGongyingList(gongying,page,rows);
    }

    //求购商
    @RequestMapping("findQiuGouList")
    @ResponseBody
    public HashMap<String,Object>findQiuGouList(QiuGou qiuGou, @RequestParam("page")Integer page, @RequestParam("rows")Integer rows){
        return webService.findQiuGouList(qiuGou,page,rows);
    }




    //查询店铺
    @RequestMapping("findDianPu")
    @ResponseBody
    public List<DianPu> findDianPu(){
        return webService.findDianPu();
    }

    //查询商品
    @RequestMapping("findshopingList")
    @ResponseBody
    public List<ShoPing> findshopingList(){
        return webService.findshopingList();
    }

    //代理分页
    @RequestMapping("findUserList")
    @ResponseBody
    public HashMap<String,Object>findUserList(Daili daili,@RequestParam("page")Integer page, @RequestParam("rows")Integer rows){
        return webService.findUserList(daili,page,rows);
    }

    //跳转该页面代理
    @RequestMapping("daili")
    public String daili(){
        return "daili";
    }



    //查询分类
    @RequestMapping("findYijiSelect")
    @ResponseBody
    public List<Fenlei> findYijiSelect(@RequestParam("id")Integer id){
        return webService.findYijiSelect(id);
    }

}
