package com.ww.controller;

import com.ww.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ww on 17/8/26.
 */
@RestController
public class HiContrller {
    @Autowired
    private TestService hiService;

    @RequestMapping("/hi")
    public String hi(String name){
        return hiService.hi(name);
    }
}
