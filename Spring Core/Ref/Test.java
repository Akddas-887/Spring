package com.demo.demo.Ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("configRef.xml");
        A a=(A) context.getBean("aref");
        System.out.println(a);
    }
}
