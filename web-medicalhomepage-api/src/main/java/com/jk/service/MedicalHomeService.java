package com.jk.service;

import com.jk.pojo.UserBean;
import com.jk.pojo.WebDirectorFigure;
import com.jk.pojo.WebDrugBean;
import com.jk.pojo.WebTree;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@RequestMapping("MedicalHomeService")
public interface MedicalHomeService {

    @RequestMapping("selectCar")
    WebDrugBean selectCar(@RequestParam("spid") Integer spid);

    @RequestMapping("selectDrupList")
    List<WebDrugBean> selectDrupList();

    @RequestMapping("selectTree1")
    List<WebTree> selectTree1(@RequestParam("pid") Integer pid);

    @RequestMapping("selectTjsp")
    List<WebDrugBean> selectTjsp();

    @RequestMapping("selectDirectorFigure")
    List<WebDirectorFigure> selectDirectorFigure();

    @RequestMapping("selectzhongxiyao")
    HashMap<String ,Object> selectzhongxiyao(@RequestParam("page")Integer page, @RequestParam("rows")Integer rows, WebDrugBean WebDrugBean);

    @RequestMapping("selectTj5")
    List<WebDrugBean>  selectTj5();



    @RequestMapping("queryDrugBeanById")
    WebDrugBean queryDrugBeanById(@RequestParam("ids")Integer ids);

    @RequestMapping("findUserByName")
    UserBean findUserByName(UserBean loginPojo);
}
