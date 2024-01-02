package com.test2.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test2.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	static Employee save(List<Employee> employee) {
		
		return null;
	}

}
