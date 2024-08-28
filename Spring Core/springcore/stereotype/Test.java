package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("stereoconfig.xml");
        Student st1=context.getBean("obj",Student.class);
        System.out.println(st1);
        //System.out.println(st1.getCity());
    }
}
