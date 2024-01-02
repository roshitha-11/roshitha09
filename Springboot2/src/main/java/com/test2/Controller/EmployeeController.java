package com.test2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test2.Entity.Employee;
import com.test2.Service.EmployeeService;
@RestController
@RequestMapping("/api")
public class EmployeeController 
{
	private final EmployeeService empService;

    @Autowired
    public EmployeeController(EmployeeService empService) {
        this.empService = empService;
    }

    @GetMapping("/get")
    public List<Employee> getEmployee() {
        return empService.getEmployee();
    }

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return empService.saveEmployee(employee);
    }
    /*@PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee updatedEmployee) {
        return empService.updateEmployee(id, updatedEmployee);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Integer id) {
        boolean isDeleted = EmployeeService.deleteEmployeeById(id);

        if (isDeleted) {
            return ResponseEntity.ok("Employee with ID " + id + " deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee with ID " + id + " not found");
        }
    }*/
    @PutMapping("/put")  
	private Employee update(@RequestBody Employee emp)   
	{  
	EmployeeService.saveOrUpdate(emp);  
	return emp;  
}
    @DeleteMapping("/delete/{id}")  
	private void deleteStudent(@PathVariable("id") int id)   
	{  
	EmployeeService.delete(id);  
	}  
}
  

