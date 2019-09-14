package org.test.ww.entity;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//如果value服务名不存在,使用url进行访问
@FeignClient(value= "provider",url= "localhost:8000")
public interface FeignService {
    @RequestMapping(value = "/provider",method = RequestMethod.GET)
    String test();
    @GetMapping
    String test2();
}
