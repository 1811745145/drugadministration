package com.jk.webserviceapi;

import com.jk.pojo.Area;
import com.jk.pojo.ClinicDrugstoreBean;
import com.jk.pojo.DcWebBean;
import com.jk.pojo.HospitalBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@RequestMapping("WebServiceApi")
public interface WebServiceApi {
    /**
     * 查询数据中心药品分页列表
     * @param page
     * @param rows
     * @param dcWebBean
     * @return
     */
    @RequestMapping("findDrugListAllPage")
    HashMap<String, Object> findDrugListAllPage(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, @RequestBody DcWebBean dcWebBean);

       /**
     * 查询数据中心药品分页列表
     * @param page
     * @param rows
     * @param
     * @return
     */
    @RequestMapping("findClinicDrugstoreAllPage")
    HashMap<String, Object> findClinicDrugstoreAllPage(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows,@RequestBody ClinicDrugstoreBean clinicDrugstoreBean);

    /**
     * 查询数据中心药品分页列表
     * @param page
     * @param rows
     * @param
     * @return
     */
    @RequestMapping("findHospitalAllPage")
    HashMap<String, Object> findHospitalAllPage(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows,@RequestBody HospitalBean hospitalBean);

    /**
     * 查询地区
     * @return
     */
    @RequestMapping("findArea")
    List<Area> findArea();

   }
