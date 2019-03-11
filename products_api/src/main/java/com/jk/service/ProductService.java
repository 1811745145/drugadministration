package com.jk.service;

import com.jk.pojo.ProductsBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequestMapping("products")
public interface ProductService {
        /**
         * 查询全部代理信息
         * @return
         */
        @GetMapping("findProductsAll")
        List<ProductsBean> findProductsAll();

}
