package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test1 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");   
	    EmployeeDao e=(EmployeeDao)ctx.getBean("edao");  
	    Employee emp=new Employee();
	    emp.setId(2);
	    emp.setName("Oracle");
	    emp.setCmp("dell");
	    emp.setSalary(2000);
	    //e.save(emp);
	    e.update(emp);
	    System.out.println("ok");
	}

}
