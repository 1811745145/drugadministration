package com.jk.controller;

import com.jk.mapper.ProductsMapper;
import com.jk.pojo.CertificateBean;
import com.jk.pojo.EnterpriseBean;
import com.jk.pojo.ProductsBean;
import com.jk.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
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
    /**
     * 根据状态查询代理信息
     * @param productsStatus
     * @return
     */
    @Override
    @ResponseBody
    public List<ProductsBean> findProductsStatusList(@RequestParam("productsStatus") Integer productsStatus) {
        return productsMapper.findProductsStatusList(productsStatus);
    }

    /**
     * 新增代理需求
     */
    @ResponseBody
    @Override
    public void saveProducts( ProductsBean productsBean) {
        if(productsBean.getProductsId() ==null){
            System.out.println("productsBean = [" + productsBean.getProductsId() + "]");
            productsMapper.saveProducts(productsBean);
        }else{
            productsMapper.updateProducts(productsBean);
        }

    }

    /**
     * 删除代理信息
     * @param productsId
     */
    @Override
    @ResponseBody
    public void delProduct(Integer productsId) {
        productsMapper.delProduct(productsId);
    }

    /**
     * 根据id查询代理信息 （回显）
     * @param productsId
     * @return
     */
    @Override
    @ResponseBody
    public ProductsBean findProductsById(Integer productsId) {
        return productsMapper.findProductsById(productsId);
    }



    /**
     * 新增企业资质
     * @param enterpriseBean
     */
    @Override
    @ResponseBody
    public void saveEnterprise( EnterpriseBean enterpriseBean) {
        productsMapper.saveEnterprise(enterpriseBean);
    }

    /**
     * 新增企业营业执照
     * @param certificateBean
     */
    @Override
    @ResponseBody
    public void saveCertificate( CertificateBean certificateBean) {
        productsMapper.saveCertificate(certificateBean);

    }
}
