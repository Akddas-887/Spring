package com.demo.demo.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("configEmp.xml");
        Emp e1=(Emp) context.getBean("emp");
        System.out.println(e1.getName());
        System.out.println(e1);
    }
}
