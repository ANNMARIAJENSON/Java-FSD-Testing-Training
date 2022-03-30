package com.ust1.spring.sprincore.lc.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InterfacesTest {

	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/ust1/spring/sprincore/lc/interfaces/interfacesconfig.xml");
		Patient p = (Patient) ac.getBean("patient");
		System.out.println(p);// to string method is invoked automatically
		ac.registerShutdownHook();

	}

}
