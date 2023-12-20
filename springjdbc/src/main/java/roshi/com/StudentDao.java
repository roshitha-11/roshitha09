package roshi.com;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveEmployee(Student e){  
	    String query="insert into stu2 values('"+e.getId()+"','"+e.getName()+"','"+e.getCmp()+"')";  
	    return jdbcTemplate.update(query);  
	} 
	
	/*public int updateEmployee(Employee e){  
	    String query="update b1 set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	} 
	
	
	public int deleteEmployee(Employee e){  
	    String query="delete from b1 where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  */
	
	  
	}  