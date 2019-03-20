package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("qhp-provider")
public interface WebService extends WebServiceApi {
}
