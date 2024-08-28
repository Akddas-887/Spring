package com.demo.demo.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("configAW.xml");
        Emp e1=context.getBean("emp", Emp.class);
        System.out.println(e1);

    }
}
