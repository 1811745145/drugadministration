package com.jk.service;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("drus-server")
public interface DrugPurchaseServiceWeb extends DrugPurchaseService{

}
