package main;

import org.springframework.jdbc.core.JdbcTemplate;

import config.DbDataSource;
import dao.StudentDao;

import model.Student;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;

public class Init {

	public static void main(String[] args) throws SQLException, DataAccessException {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(DbDataSource.class);
		ctx.refresh();
		
		StudentDao dao = (StudentDao) ctx.getBean("studentDao");
		List<Student> list=dao.getAllStudentsRowMapper();
        
	    for(Student s:list)  
	        System.out.println(s);  
	     
	          
	    }  
		
	
		//int status = dao.saveStudent(new Student(1, "Pippo"));
		
		
		//System.out.println(status);
		

	}


