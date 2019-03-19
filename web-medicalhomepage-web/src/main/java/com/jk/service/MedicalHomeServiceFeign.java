package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("web-medicalhomepage-server")
public interface MedicalHomeServiceFeign extends  MedicalHomeService{
}
