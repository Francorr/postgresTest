package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import model.Student;

public class StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int saveStudent(Student s) {
		String query = "insert into table_test(prova) VALUES('" + s.getProva() + "')";
		return jdbcTemplate.update(query);
	}

	public int updateStudent(Student s) {
		String query = "update student set name='" + s.getProva() + " where id='" + s.getID() + "' ";
		return jdbcTemplate.update(query);
	}

	public List<Student> getAllStudentsRowMapper(){  
		 return jdbcTemplate.query("select * from table_test",new RowMapper<Student>(){  
		    
		    public Student mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Student s=new Student(rownumber, null);  
		        s.setID(rs.getInt(1));  
		        s.setProva(rs.getString(2));  
		         
		        return s;
		        		
		    }  
		    });  
		}  

	/*public int readStudent(Student s) {
		String query = "select * from table_test";

		return jdbcTemplate.update(query);
	}*/

	public int deleteStudent(Student s) {
		String query = "delete from student where id='" + s.getID() + "' ";
		return jdbcTemplate.update(query);
	}

}
