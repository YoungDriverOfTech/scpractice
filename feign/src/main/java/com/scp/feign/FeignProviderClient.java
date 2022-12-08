package com.scp.feign;

import com.scp.entity.Student;
import com.scp.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

// 访问注册中心中注册的provider服务
@FeignClient(value = "provider", fallback = FeignError.class)
public interface FeignProviderClient {

    // 访问微服务里面的方法，不用写实现
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    // 访问微服务里面的方法，不用写实现
    @GetMapping("/student/index")
    public String index();
}
