package com.jk.webmapper;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebDrugMapper {

    int findDrugListCount(@Param("dcWebBean") DcWebBean dcWebBean);
    /**
     * 查询数据中心药品分页列表
     * @param
     * @param rows
     * @param dcWebBean
     * @return
     */
    List<DcWebBean> findDrugListAllPage(@Param("start") Integer start,@Param("rows") Integer rows,@Param("dcWebBean") DcWebBean dcWebBean);

    int findClinicDrugstoreAllCount(@Param("clinicDrugstoreBean") ClinicDrugstoreBean clinicDrugstoreBean);
    /**
     * 查询数据中心药品分页列表
     * @param
     * @param rows
     * @param
     * @return
     */
    List<ClinicDrugstoreBean> findClinicDrugstoreAllPage(@Param("start") Integer start,@Param("rows") Integer rows,@Param("clinicDrugstoreBean") ClinicDrugstoreBean clinicDrugstoreBean);



    int findHospitalAllCount(@Param("hospitalBean") HospitalBean hospitalBean);
    /**
     * 查询医院分页列表
     * @param
     * @param rows
     * @param
     * @return
     */
    List<HospitalBean> findHospitalAllPage(@Param("start") Integer start,@Param("rows") Integer rows,@Param("hospitalBean")  HospitalBean hospitalBean);


    /**
     * 查询地区
     * @return
     */
    List<Area> findArea();


}
