package com.pratian.be;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pratian.entity.Employee;


public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext factory =new ClassPathXmlApplicationContext("beans.xml");
		Employee emp=(Employee) factory.getBean("emp");
		System.out.println(emp.getAdrs().getId());	
    }
}
