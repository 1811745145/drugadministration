package com.jk.controller;


import com.jk.client.StoreClient;
import com.jk.pojo.StoreBean;
import com.jk.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("store")
public class StoreController {

    @Autowired
    private StoreClient storeClient;

    //跳转店铺
    @RequestMapping("toStore")
    public String toStore(){
        return "storeList";
    }

    /**
     * 跳转新增
     */
    @RequestMapping("addStore")
    public String addStore() {
        return "addStore";
    }

    /**
     * 新增修改
     */
    @RequestMapping("saveStore")
    @ResponseBody
    public Boolean saveStore(StoreBean storeBean) {
        if(storeBean.getId() == null) {
            try {
                //如果有id则修改，没有则新增
                storeClient.saveStore(storeBean);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    //图片上传
    @ResponseBody
    @RequestMapping("upload")
    public HashMap<String, String> upload(MultipartFile img, HttpServletRequest request) {
        HashMap<String, String> result = new HashMap<>();
        String fileUpload = FileUtil.FileUpload(img, request);
        result.put("img", fileUpload);
        return result;
    }


}
