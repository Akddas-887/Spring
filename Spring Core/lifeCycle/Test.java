package com.demo.demo.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.locks.Condition;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("configLC.xml");
       /* Samosa s1=(Samosa) context.getBean("samosa");
        System.out.println(s1);
        System.out.println("+++++++++");
        Pepsi p1=(Pepsi) context.getBean("pepsi");
        System.out.println(p1);*/
        Example e1=(Example) context.getBean("example");
        System.out.println(e1);

        context.registerShutdownHook();
    }
}
