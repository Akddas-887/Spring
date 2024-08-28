package com.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello");
		ApplicationContext context =
				new ClassPathXmlApplicationContext("config.xml");

		Student st1=(Student) context.getBean("Student1");
		System.out.println(st1);
	}

}
