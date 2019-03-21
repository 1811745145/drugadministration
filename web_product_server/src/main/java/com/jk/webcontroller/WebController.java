package com.jk.webcontroller;

import com.jk.pojo.*;
import com.jk.webmapper.WebDrugMapper;
import com.jk.webserviceapi.WebServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
public class WebController implements WebServiceApi {

    @Autowired
    private WebDrugMapper webDrugMapper;

    /**
     * 查询数据中心药品分页列表
     * @param page
     * @param rows
     * @param dcWebBean
     * @return
     */
    @Override
    @ResponseBody
    public HashMap<String, Object> findDrugListAllPage(@RequestParam("page") Integer page, @RequestParam("rows")Integer rows,@RequestBody DcWebBean dcWebBean) {
        HashMap<String, Object> hashMap = new HashMap<>();
        int total = webDrugMapper.findDrugListCount(dcWebBean);
        int start=(page-1)*rows;
        List<DcWebBean>list= webDrugMapper.findDrugListAllPage(start,rows,dcWebBean);
        hashMap.put("total",total);
        hashMap.put("rows",list);
        return hashMap;
    }

    /**
     * 查询数据中心药品分页列表
     * @param page
     * @param rows
     * @param
     * @return
     */
    @Override
    @ResponseBody
    public HashMap<String, Object> findClinicDrugstoreAllPage(@RequestParam("page") Integer page, @RequestParam("rows")Integer rows,@RequestBody ClinicDrugstoreBean clinicDrugstoreBean) {
        HashMap<String, Object> hashMap = new HashMap<>();
        int total = webDrugMapper.findClinicDrugstoreAllCount(clinicDrugstoreBean);
        int start=(page-1)*rows;
        List<ClinicDrugstoreBean>list= webDrugMapper.findClinicDrugstoreAllPage(start,rows,clinicDrugstoreBean);
        hashMap.put("total",total);
        hashMap.put("rows",list);
        return hashMap;
    }

    /**
     * 查询数据中心药品分页列表
     * @param page
     * @param rows
     * @param
     * @return
     */
    @Override
    @ResponseBody
    public HashMap<String, Object> findHospitalAllPage(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows,@RequestBody HospitalBean hospitalBean) {
        HashMap<String, Object> hashMap = new HashMap<>();
        int total = webDrugMapper.findHospitalAllCount(hospitalBean);
        int start=(page-1)*rows;
        List<HospitalBean>list= webDrugMapper.findHospitalAllPage(start,rows,hospitalBean);
        hashMap.put("total",total);
        hashMap.put("rows",list);
        return hashMap;
    }

    /**
     * 查询地区
     * @return
     */
    @ResponseBody
    @Override
    public List<Area> findArea() {
        return webDrugMapper.findArea();
    }


}
