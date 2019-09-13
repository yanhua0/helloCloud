package org.test.ww.entity;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "provider")
public interface FeignService {
    @RequestMapping(value = "/provider",method = RequestMethod.GET)
    String test();
}
