package com.jk.mapper;

import com.jk.pojo.ProductsBean;

import java.util.List;

public interface ProductsMapper {
    /**
     * 查询全部代理信息
     * @return
     */
    List<ProductsBean> findProductsAll();
}
