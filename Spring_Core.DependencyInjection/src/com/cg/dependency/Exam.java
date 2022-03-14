package com.cg.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 Student nayum = context.getBean("student" , Student.class);
		 nayum.displayStudentInfo();
		 
		 Student suryaK = context.getBean("surya",Student.class);
		 suryaK.displayStudentInfo();
		
	}

}
