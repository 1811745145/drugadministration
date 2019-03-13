package com.jk.client;

import com.jk.pojo.TreeBean;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@FeignClient("producer")
public interface TreeClient {

    //查询树
    @PostMapping("gettree")
    List<TreeBean> bootstraptree();
}
