package com.jk.service;

import com.jk.pojo.CertificateBean;
import com.jk.pojo.EnterpriseBean;
import com.jk.pojo.ProductsBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("products")
public interface ProductService {
        /**
         * 查询全部代理信息
         * @return
         */
        @RequestMapping("findProductsAll")
        List<ProductsBean> findProductsAll();


        /**
         * 新增代理需求
         */
        @RequestMapping(value = "saveProducts",method = RequestMethod.POST)
        @ResponseBody
        void saveProducts(@RequestBody ProductsBean productsBean);
        /**
         * 根据状态查询代理信息
         * @return
         */
        @RequestMapping("findProductsStatusList")
        List<ProductsBean> findProductsStatusList(@RequestParam("productsStatus")Integer productsStatus);
        /**
         * 删除代理信息
         */
        @RequestMapping("productsId")
        void delProduct(@RequestParam("productsId")Integer productsId);

        /**
         * 根据id查询代理信息 （回显）
         * @param productsId
         * @return
         */
        @RequestMapping("findProductsById")
        ProductsBean findProductsById(@RequestParam("productsId")Integer productsId);


        /**
         * 新增企业资质
         */
        @RequestMapping("saveEnterprise")
        void saveEnterprise( @RequestBody EnterpriseBean enterpriseBean);

        /**
         * 新增企业营业执照
         */
        @RequestMapping("saveCertificate")
        void saveCertificate(@RequestBody CertificateBean certificateBean);

}
