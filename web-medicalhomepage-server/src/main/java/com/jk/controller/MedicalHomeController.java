package com.jk.controller;

import com.jk.mapper.MedicalHomeMapper;
import com.jk.pojo.UserBean;
import com.jk.pojo.WebDirectorFigure;
import com.jk.pojo.WebDrugBean;
import com.jk.pojo.WebTree;
import com.jk.service.MedicalHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class MedicalHomeController implements MedicalHomeService {

    @Autowired
    private MedicalHomeMapper  medicalHomeMapper;

    @Override
    @ResponseBody
    public WebDrugBean selectCar(Integer spid) {
        WebDrugBean webDrugBean=medicalHomeMapper.selectCar(spid);
        return webDrugBean;
    }

    @Override
    @ResponseBody
    public List<WebDrugBean> selectDrupList() {
        List<WebDrugBean>  webDrugBean=medicalHomeMapper.selectDrupList();
        return webDrugBean;
    }

    @Override
    @ResponseBody
    public List<WebTree> selectTree1(Integer pid) {
        List<WebTree> list=medicalHomeMapper.selectTree1(pid);
        return list;
    }

    @Override
    @ResponseBody
    public List<WebDrugBean> selectTjsp() {
        List<WebDrugBean> list=medicalHomeMapper.selectTjsp();
        return list;
    }

    @Override
    @ResponseBody
    public List<WebDirectorFigure> selectDirectorFigure() {
        List<WebDirectorFigure>  list=medicalHomeMapper.selectDirectorFigure();
        return list;
    }

    @Override
    @ResponseBody
    public HashMap<String ,Object> selectzhongxiyao(Integer page, Integer rows,@RequestBody WebDrugBean webDrugBean) {
        HashMap<String ,Object> result=new HashMap<>();
        Integer count = medicalHomeMapper.selectzhongxiyaocount(webDrugBean);
        int start=(page-1)*rows;
        List<WebDrugBean>list=medicalHomeMapper.selectzhongxiyao(start,rows,webDrugBean);
        result.put("total",count);
        result.put("rows",list);
        return result;
    }

    @Override
    @ResponseBody
    public List<WebDrugBean> selectTj5() {
        List<WebDrugBean> webDrugBean=medicalHomeMapper.selectTj5();
        return webDrugBean;
    }

    @Override
    @ResponseBody
    public WebDrugBean queryDrugBeanById(Integer ids) {
        return medicalHomeMapper.queryDrugBeanById(ids);
    }
    @Override
    @ResponseBody
    public UserBean findUserByName(@RequestBody UserBean loginPojo) {


        return medicalHomeMapper.findUserByName(loginPojo.getUserName());
    }

}
