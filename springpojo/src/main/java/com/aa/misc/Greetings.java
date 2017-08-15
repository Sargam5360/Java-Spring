
package com.aa.misc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Greetings {

	private static ApplicationContext studentContext;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 		studentContext = new ClassPathXmlApplicationContext("University-beans.xml");
 		StudentAddress mystudent = (StudentAddress) studentContext.getBean("stdadd1");
		
		System.out.println(mystudent.getStudent().getName());
		System.out.println(mystudent.getAddress().getAddress());
		
		StudentAddress mystudent1 = (StudentAddress) studentContext.getBean("stdadd2");
		
		System.out.println(mystudent1.getStudent().getName());
		System.out.println(mystudent1.getAddress().getAddress());
	}

}
