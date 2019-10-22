package org.test.ww.entity;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//如果value服务名不存在,使用url进行访问
@FeignClient(value= "provider",url= "localhost:8000")
public interface FeignService {
    @RequestMapping(value = "/provider", method = RequestMethod.POST)
    @ResponseBody
    String test(List<String> list);

    @GetMapping
    String test2();
}
