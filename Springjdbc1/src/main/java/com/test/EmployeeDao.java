package com.test;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;
	public  void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	public int save(Employee emp)
	{
		String sql="insert into stu5 values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getCmp()+"','"+emp.getSalary()+"')";    
	    return jdbcTemplate.update(sql); 
	}
	public int update(Employee emp)
	{
		String sql="update stu5 set name='"+emp.getName()+"',salary='"+emp.getSalary()+"' where id='"+emp.getId()+"' ";  
	    return jdbcTemplate.update(sql);  
	}
	/*public int delete(Employee emp)
	{
	String sql="delete";
	return jdbcTemplate.update(sql);
	}
	public int list(Employee emp)
	{
	String sql="select";
	return jdbcTemplate.update(sql);
	}*/
	
}
