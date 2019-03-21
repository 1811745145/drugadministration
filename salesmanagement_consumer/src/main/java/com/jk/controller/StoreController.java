package com.jk.controller;


import com.jk.client.IOssService;
import com.jk.client.StoreClient;
import com.jk.pojo.StoreBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@Controller
@RequestMapping("store")
public class StoreController {

    @Autowired
    private StoreClient storeClient;

    @Autowired
    private IOssService iOssService;

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


    /**
     * OSS阿里云上传图片
     */
    @PostMapping("updaloadImg")
    @ResponseBody
    public HashMap<String, Object> updaloadImg(HttpServletRequest request, HttpServletResponse response, MultipartFile img) throws IOException {
        HashMap<String, Object> result = new HashMap<>();
        String img2 = iOssService.uploadImg(img);
        result.put("path",img2);
        return result;
    }


}
