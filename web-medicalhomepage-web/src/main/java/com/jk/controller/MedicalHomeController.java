package com.jk.controller;

import com.jk.pojo.*;
import com.jk.service.MedicalHomeServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("MedicalHomeController")
public class MedicalHomeController {

    @Autowired
    private MedicalHomeServiceFeign medicalHomeServiceFeign;

    /*跳转住页面*/
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("junmpMedicalHome")
    public String junmpMedicalHome() {
        return "home";
    }

    @RequestMapping("junmpgouwuc")
    public String junmpgouwuc() {
        return "mycar";
    }

    @RequestMapping("tohuodong")
    public String tohuodong() {
        return "huodong";
    }

    /*引入商品展示页面*/
    @RequestMapping("junmpclassify")
    public String junmpclassify(Integer dugtype , Model model) {
        model.addAttribute("dugtype",dugtype);
        System.out.println(dugtype);
        return "classify";
    }
    /*引入购物车页面*/
    @RequestMapping("junmpmycar")
    public String  junmpmycar() {
        return "mycar";
    }



    /*查询医药信息首页推荐*/
    @RequestMapping("selectDrupList")
    @ResponseBody
    public List<WebDrugBean> selectDrupList(){
        return medicalHomeServiceFeign.selectDrupList();
    }

    //*添加购物车*//*
    @ResponseBody
    @RequestMapping("addCar")
    public String addCar(Integer spid, HttpServletRequest request, HttpServletResponse response, Integer sl) {
        WebShoppingcCart webShoppingcCart = new WebShoppingcCart();
        HttpSession session = request.getSession();
        WebUserBean webUserBean1 = (WebUserBean) redisTemplate.opsForValue().get("user");
        System.out.println(webUserBean1);
        Integer biaoshi = 0;
        //*查询用户是否登录*//*
        WebUserBean user = (WebUserBean) session.getAttribute("user");
        if (webUserBean1 != null) {
            Boolean aBoolean = redisTemplate.hasKey(user.getUserid());
            if (aBoolean) {

                webShoppingcCart = (WebShoppingcCart) redisTemplate.opsForValue().get(user.getUserid());

                for (WebDrugBean emt : webShoppingcCart.getWebDrugBean()) {

                    Integer  id=emt.getId();
                    if (spid.equals(id)) {
                        emt.setAcount(emt.getAcount() + sl);
                        biaoshi=1;
                    }
                }
                if (biaoshi != 1) {
                    WebDrugBean webDrugBean = medicalHomeServiceFeign.selectCar(spid);
                    webDrugBean.setAcount(sl);

                    webShoppingcCart.setAdddate(new Date().toString());
                    if (webShoppingcCart.getWebDrugBean()==null){
                        List<WebDrugBean> objects = new ArrayList<>();
                        objects.add(webDrugBean);
                        webShoppingcCart.setWebDrugBean(objects);
                    }else{
                        webShoppingcCart.getWebDrugBean().add(webDrugBean);
                    }
                }
            } else {
                WebDrugBean webDrugBean = medicalHomeServiceFeign.selectCar(spid);
                webDrugBean.setAcount(sl);
                webShoppingcCart.setAdddate(new Date().toString());
                if (webShoppingcCart.getWebDrugBean()==null){
                    List<WebDrugBean> objects = new ArrayList<>();
                    objects.add(webDrugBean);
                    webShoppingcCart.setWebDrugBean(objects);
                }else{
                    webShoppingcCart.getWebDrugBean().add(webDrugBean);
                }
            }
            redisTemplate.opsForValue().set(user.getUserid(), webShoppingcCart, 20, TimeUnit.MINUTES);
            /**/
            return "1";
        } else {
            return "0";
        }
    }

    /*查询购物车*/
    @ResponseBody
    @RequestMapping("selectCarAll")
    public WebShoppingcCart selectCarAll(HttpServletRequest httpServletRequest){
        HttpSession session = httpServletRequest.getSession();
        WebUserBean webUserBean1 = (WebUserBean) redisTemplate.opsForValue().get("user");
        WebShoppingcCart webShoppingcCart = new WebShoppingcCart();
        if (webUserBean1 !=null){
            webShoppingcCart = (WebShoppingcCart) redisTemplate.opsForValue().get(webUserBean1.getUserid());
            return webShoppingcCart;
        }else{
            return  webShoppingcCart;
        }
    }

    /*查询树*/
    @ResponseBody
    @RequestMapping("selectTree1")
    public   List<WebTree>   selectTree1(Integer  pid){
        List<WebTree>  list=medicalHomeServiceFeign.selectTree1(pid);
        return list;
    }
    /*查询购物车下边推荐商品*/
    @ResponseBody
    @RequestMapping("selectTjsp")
    public   List<WebDrugBean>  selectTjsp(){
        List<WebDrugBean> list=medicalHomeServiceFeign.selectTjsp();
        return list;
    }

    /*加载轮转图selectDirectorFigure*/
    @ResponseBody
    @RequestMapping("selectDirectorFigure")
    public   List<WebDirectorFigure>  selectDirectorFigure(){
        List<WebDirectorFigure> list=medicalHomeServiceFeign.selectDirectorFigure();
        return list;
    }


    /*点击左侧树 查询医药*/
    @RequestMapping("selectzhongxiyao")
    @ResponseBody
    public HashMap<String ,Object> selectzhongxiyao(Integer page, Integer rows, WebDrugBean WebDrugBean){
        HashMap<String ,Object>  list=medicalHomeServiceFeign.selectzhongxiyao(page,rows,WebDrugBean);
        return list;
    }
    @RequestMapping("selectTj5")
    @ResponseBody
    public  List<WebDrugBean> selectTj5(){
        List<WebDrugBean>  list=medicalHomeServiceFeign.selectTj5();
        return list;
    }

    /*跳转商品详情*/
    @RequestMapping("junmpspxq")
    public String junmpspxq(Integer  id,Model  model){
        model.addAttribute("id",id);
      return  "xiangqing";
    }


    @RequestMapping("queryDrugBeanById")
    @ResponseBody
    public WebDrugBean queryDrugBeanById(Integer  ids){
        WebDrugBean list= medicalHomeServiceFeign.queryDrugBeanById(ids);
        return list;
    }
}
