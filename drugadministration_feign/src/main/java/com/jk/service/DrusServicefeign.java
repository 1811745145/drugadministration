package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("provider-drus")
public interface DrusServicefeign extends DrusService{
}
