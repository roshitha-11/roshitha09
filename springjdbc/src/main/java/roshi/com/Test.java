package roshi.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");  
	      
	    StudentDao dao=(StudentDao)ctx.getBean("edao");  
	   int status=dao.saveEmployee(new Student(101,"priya","Ap"));
	   int status1=dao.saveEmployee(new Student( 102,"sush","tn"));  
	    System.out.println(status1);                               
	    System.out.println("Done.");
	          
	   /* int status=dao.updateEmployee(new Employee(101,"bhavya",15000)); 
	  System.out.println(status); 
	     
	          
	    Student e=new Student(); 
	  e.setId(101); 
	    int status=dao.deleteEmployee(e); 
	   System.out.println(status);
	      */
	}  


	}


