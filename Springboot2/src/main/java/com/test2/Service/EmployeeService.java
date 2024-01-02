package com.test2.Service;

import java.util.List;

import com.test2.Entity.Employee;

public interface EmployeeService 
{
	public Employee add(Employee emp);
	public List<Employee> getEmployee();
	public Employee saveEmployee(Employee employee);
	public static void saveOrUpdate(Employee emp) {
		
		
	}
	public static void delete(int id) {
		
		
	}
	
}
