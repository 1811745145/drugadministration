package com.jk.client;

import com.jk.pojo.RecruitBean;
import com.jk.util.PageResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("frontendProducer")
public interface RecruitClient {

    //招商信息查询
    @PostMapping("getRecruit")
    PageResult getRecruit(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, @RequestBody RecruitBean recruitBean);


    //查询招商商品
    @PostMapping("queryRecruit")
    List<RecruitBean> queryRecruit(RecruitBean recruitBean);
}
