package com.ust1.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesTest {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ust1/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndLanguages cl=(CountriesAndLanguages) ac.getBean("countriesandlangs");
		System.out.println(cl);
	}

}
