package com.scp.feign.impl;

import com.scp.entity.Student;
import com.scp.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {

    // 访问这些方法的时候如果出错，就返回这个类里面的内容
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器正在维护";
    }
}
