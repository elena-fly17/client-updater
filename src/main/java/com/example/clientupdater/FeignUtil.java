package com.example.clientupdater;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "client-service")
public interface FeignUtil {

    @GetMapping("/api/client/test")
    public String getTestStringLoadBalancerFeignClient();
}