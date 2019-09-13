package org.test.ww.web;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/feign")
    @HystrixCommand(fallbackMethod = "hiError") //快速失败
    public String t(String name){
        return restTemplate.getForObject("http://provider/provider",String.class);
    }
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
