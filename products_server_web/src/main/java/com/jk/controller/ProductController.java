package com.jk.controller;

import com.jk.pojo.ProductsBean;
import com.jk.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductsService productsService;

    /**
     * 查询全部代理信息
     * @return
     */
    @ResponseBody
    @GetMapping("findProductsAll")
    public List<ProductsBean> findProductsAll(){
        return productsService.findProductsAll();
    }
    /**
     * 跳转全部代理信息页面
     * @return
     */
    @RequestMapping("toProductsAll")
    public String toProductsAll(){
        return "productsalllist";
    }
}
