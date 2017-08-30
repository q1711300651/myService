package com.ww.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ww on 17/8/26.
 */
@FeignClient(value = "SERVICE-HI")
public interface TestService {
    @RequestMapping(value="/hi",method = RequestMethod.GET)
     String hi(@RequestParam(value = "name") String name);
}
