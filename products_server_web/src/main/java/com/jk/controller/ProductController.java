package com.jk.controller;

import com.jk.pojo.CertificateBean;
import com.jk.pojo.EnterpriseBean;
import com.jk.pojo.ProductsBean;
import com.jk.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("productscontroller")
public class ProductController {

    @Autowired
    private ProductsService productsService;

    /**
     * 查询全部代理信息
     * @return
     */
    @ResponseBody
    @RequestMapping("findProductsAll")
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


    /**
     * 跳转修改代理信息页面 张志博
     * @return
     */
    @RequestMapping("toUpdateAgencyList")
    public String toUpdateAgencyList(){
        return "updateAgencyList";
    }
    /**
     * 跳转新增代理信息页面 张志博
     * @return
     */
    @RequestMapping("tosaveproducts")
    public String tosaveproducts(){
        return "saveproducts";
    }

    /**
     * 跳转新增代理信息页面 张志博
     * @return
     */
    @RequestMapping("tosaveEnterprise")
    public String tosaveEnterprise(){
        return "saveEnterpriseList";
    }
    /**
     * 根据状态查询代理信息
     * @return
     */
    @ResponseBody
    @RequestMapping("findProductsStatusList")
    public List<ProductsBean> findProductsStatusList(@RequestParam("productsStatus")Integer productsStatus){
        return productsService.findProductsStatusList( productsStatus);
    }

    /**
     * 新增代理需求
     */
    @RequestMapping(value = "saveProducts",method = RequestMethod.POST)
    @ResponseBody
    public Boolean saveProducts( ProductsBean productsBean){
        try {
            System.out.println("productsBean = [" + productsBean.getProductsId() + "]");
            productsService.saveProducts(productsBean);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 删除代理信息
     */
    @RequestMapping("delProduct")
    @ResponseBody
    public Boolean delProduct(@RequestParam("productsId")Integer productsId){
        try {
            productsService.delProduct(productsId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }


    }

    /**
     * 根据id查询代理信息 （回显）
     * @param productsId
     * @return
     */
    @ResponseBody
    @RequestMapping("findProductsById")
    public ProductsBean findProductsById(@RequestParam("productsId")Integer productsId){
        return productsService.findProductsById(productsId);
    }

    /**
     * 新增企业资质
     */
    @RequestMapping("saveEnterprise")
    @ResponseBody
    public Boolean saveEnterprise( EnterpriseBean enterpriseBean){
        try {
            productsService.saveEnterprise(enterpriseBean);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 新增企业营业执照
     */
    @RequestMapping("saveCertificate")
    @ResponseBody
    public void saveCertificate( CertificateBean certificateBean){
        productsService.saveCertificate(certificateBean);
    }
}
