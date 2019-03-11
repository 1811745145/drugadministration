package com.jk.controller;

import com.jk.mapper.ProductsMapper;
import com.jk.pojo.ProductsBean;
import com.jk.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductsController implements ProductService {

    /**
     *查询全部代理信息
     */
    @Autowired
    private ProductsMapper productsMapper;
    @Override
    @ResponseBody
    public List<ProductsBean> findProductsAll() {
        return productsMapper.findProductsAll();
    }
}
