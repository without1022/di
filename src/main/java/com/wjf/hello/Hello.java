package com.wjf.hello;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
@Setter
@Getter
public class Hello {
    @Autowired
    test1 t1;
    public String sayHello(){
        System.out.println(t1.mothed1());

        return "success";
    }
}
