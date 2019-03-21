package com.jk.webservice;

import com.jk.webserviceapi.WebServiceApi;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient("provider-webdrus")
public interface WebService extends WebServiceApi {


}
