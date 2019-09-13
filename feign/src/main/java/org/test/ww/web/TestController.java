package org.test.ww.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.ww.entity.FeignService;
@RestController
public class TestController {
    @Autowired
    private FeignService feignService;
    @GetMapping("/feign")
    public String t(){
        return feignService.test();
    }
}
