package com.yby.nacosconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yby
 * @Date 2020/9/16 15:49
 **/
//支持nacos的动态刷新功能
@RefreshScope
@RestController
public class ConfigController {

    @Value("${nacos.config}")
    private String config;

    @GetMapping("/getValue")
    public String getValue() {
        return config;
    }
}
