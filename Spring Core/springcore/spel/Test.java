package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spelconfig.xml");
        Demo d1=context.getBean("demo",Demo.class);
        System.out.println(d1);

        /*SpelExpressionParser temp=new SpelExpressionParser();
        Expression exp=temp.parseExpression("11+22");
        System.out.println(exp.getValue());*/
    }
}
