package com.ust1.spring.springbasiclearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/ust1/spring/springbasiclearning/config.xml");
		Employee x = (Employee) ctx.getBean("emp");
		System.out.println("Employye ID: " + x.getId());
		System.out.println("Employee Name : " + x.getName());
	}
}
