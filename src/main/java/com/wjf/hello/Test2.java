package com.wjf.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("springContext.xml");
        // 2.从ioc容器中获取bean实例
        test1 t1 = (test1) ac.getBean("t1");
        System.out.println(t1.mothed1());
    }
}
