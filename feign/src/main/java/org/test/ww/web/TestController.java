package org.test.ww.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.ww.entity.FeignService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    @Autowired
    private FeignService feignService;
    @GetMapping("/feign")
    public String t(){
        List<String> list=new ArrayList<>();
        list.add("123");
        list.add("44");
        return feignService.test(list);
    }
}
