package org.test.eu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Bean
    @LoadBalanced//使其具有负载均衡的能力，可以使用服务提供应用名进行访问
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/consumer")
    public String con(){
        return restTemplate.getForObject("http://provider/provider",String.class);
    }
    @GetMapping("/consumer1")
    public String con2(){
        return "12312";
    }
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int index = 0; // 索引:指定起始位置
        while (true) {
            int nextIndex = (index+1 ) % arr.length;
            index = nextIndex;
            System.out.println(arr[index] + " ,index=" + index);
        }
    }

}
