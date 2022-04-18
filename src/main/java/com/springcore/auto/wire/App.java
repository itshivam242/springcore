package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("configautowire.xml");
        Employee employee1= (Employee) context.getBean("employee1");
        System.out.println(employee1);
        Employee employee2= (Employee) context.getBean("employee2");
        System.out.println(employee2);
        Employee employee3= (Employee) context.getBean("employee3");
        System.out.println(employee3);
        Employee employee4= (Employee) context.getBean("employee4");
        System.out.println(employee4);
        Employee employee5= (Employee) context.getBean("employee5");
        System.out.println(employee5);
        Employee employee6= (Employee) context.getBean("employee6");
        System.out.println(employee6);
    }
}
