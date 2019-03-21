package com.jk.webcontroller;

import com.jk.pojo.Area;
import com.jk.pojo.ClinicDrugstoreBean;
import com.jk.pojo.DcWebBean;
import com.jk.pojo.HospitalBean;
import com.jk.webservice.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class WebController {

    @Autowired
    private WebService webService;
    /**
     * 跳转数据中心平台页面
     * @return
     */
    @RequestMapping("toDataCentre")
    public String toDataCentre(){
        return "data_centre";
    }

    /**
     * 查询数据中心药品分页列表
     * @param page
     * @param rows
     * @param dcWebBean
     * @return
     */
    @RequestMapping("findDrugListAllPage")
    @ResponseBody
    public HashMap<String, Object> findDrugListAllPage( Integer page,  Integer rows, DcWebBean dcWebBean){
        System.out.println("page = [" + page + "], rows = [" + rows + "], dcWebBean = [" + dcWebBean + "]");
        return webService.findDrugListAllPage(page,rows,dcWebBean);
    }

    /**
     * 跳转诊所药店大全页面
     * @return ClinicDrugstoreBean
     */
    @RequestMapping("toClinicDrugstore")
    public String toClinicDrugstore(){
        return "clinicdrugstore";
    }

    /**
     * 查询诊所药店分页列表
     * @param page
     * @param rows
     * @param
     * @return
     */
    @RequestMapping("findClinicDrugstoreAllPage")
    @ResponseBody
    public HashMap<String, Object> findClinicDrugstoreAllPage( Integer page,  Integer rows, ClinicDrugstoreBean clinicDrugstoreBean){
        System.out.println("page = [" + page + "], rows = [" + rows + "], clinicDrugstoreBean = [" + clinicDrugstoreBean.getProvinceId() + "]");
        return webService.findClinicDrugstoreAllPage(page,rows,clinicDrugstoreBean);
    }


    /**
     * 跳转医院页面
     * @return ClinicDrugstoreBean
     */
    @RequestMapping("toHospital")
    public String toHospital(){
        return "hospital";
    }


    /**
     * 查询医院分页列表
     * @param page
     * @param rows
     * @param
     * @return
     */
    @RequestMapping("findHospitalAllPage")
    @ResponseBody
    public HashMap<String, Object> findHospitalAllPage( Integer page,  Integer rows, HospitalBean hospitalBean){
        System.out.println("page = [" + page + "], rows = [" + rows + "], hospitalBean = [" + hospitalBean.getProvinceId() + "]");
        return webService.findHospitalAllPage(page,rows,hospitalBean);
    }

    /**
     * 查询地区
     * @return
     */
    @RequestMapping("findArea")
    @ResponseBody
    public List<Area> findArea(){
        return webService.findArea();
    }
}
