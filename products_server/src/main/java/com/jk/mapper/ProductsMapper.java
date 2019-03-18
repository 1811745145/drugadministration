package com.jk.mapper;

import com.jk.pojo.CertificateBean;
import com.jk.pojo.EnterpriseBean;
import com.jk.pojo.ProductsBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductsMapper {
    /**
     * 查询全部代理信息
     * @return
     */
    List<ProductsBean> findProductsAll();


    /**
     * 根据状态查询待审核信息列表
     */
    List<ProductsBean> findProductsStatusList(@Param("productsStatus") Integer productsStatus);

    /**
     * 新增代理需求
     */
    void saveProducts(ProductsBean productsBean);

    /**
     * 删除代理信息
     */
    void delProduct(@Param("productsId") Integer productsId);

    /**
     * 根据id查询代理信息 （回显）
     * @param productsId
     * @return
     */
    ProductsBean findProductsById(@Param("productsId")Integer productsId);

    /**
     * 修改代理需求
     */
    void updateProducts(ProductsBean productsBean);

    /**
     * 新增企业资质
     */
    void saveEnterprise(EnterpriseBean enterpriseBean);

    /**
     * 新增企业营业执照
     */
    void saveCertificate(CertificateBean certificateBean);
}
