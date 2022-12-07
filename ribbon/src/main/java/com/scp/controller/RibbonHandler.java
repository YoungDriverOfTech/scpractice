package com.scp.controller;

import com.scp.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        // 调用eureka注册的服务，只用提供eureka里面注册的名字就行了，比如这块用provider代替了ip
        return restTemplate.getForObject("http://provider/studnet/findAll", Collection.class);
    }
}
