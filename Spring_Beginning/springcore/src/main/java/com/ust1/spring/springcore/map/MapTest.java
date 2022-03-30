package com.ust1.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapTest {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/ust1/spring/springcore/map/mapconfig.xml");
		Customer c = (Customer) ac.getBean("customer");
		System.out.println(c);
	}

}
