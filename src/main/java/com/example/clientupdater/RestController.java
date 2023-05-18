package com.example.clientupdater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/update")
public class RestController {

    @Autowired
    private FeignUtil feignUtil;

    @GetMapping
    public String getTestStringLoadBalancerFeignClient() {
        return feignUtil.getTestStringLoadBalancerFeignClient();
    }
}