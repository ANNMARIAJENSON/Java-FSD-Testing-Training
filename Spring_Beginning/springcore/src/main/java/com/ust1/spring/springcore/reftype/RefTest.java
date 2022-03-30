package com.ust1.spring.springcore.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/ust1/spring/springcore/reftype/refconfig.xml");
		Student s=(Student) ac.getBean("student");
		System.out.println(s);
	}

}
