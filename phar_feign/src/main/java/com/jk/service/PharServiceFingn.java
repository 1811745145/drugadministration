package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @program: dru
 * @Date: 2019/3/19 20:13
 * @Author: Mr.Deng
 * @Description:
 */
@FeignClient("provi")
public interface PharServiceFingn extends PharService{

}
