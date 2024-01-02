package com.test2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test2.Entity.Employee;
import com.test2.Repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl  implements EmployeeService{
	@Autowired
	private EmployeeRepository empRepository;
	public List<Employee>getEmployee()
	{
		return empRepository.findAll();
	}
	@Override
	public Employee add(Employee emp) {
		
		return empRepository.save(emp);
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return empRepository.save(employee);
	}
	public void saveOrUpdate(Employee emp)   
	{  
	empRepository.save(emp); 
	
	
	}

}
