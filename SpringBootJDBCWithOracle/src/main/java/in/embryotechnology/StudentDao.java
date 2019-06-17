package in.embryotechnology;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int save(Student student) {
		
		String sql="insert into student_tbl values(?,?,?,?)";
		return jdbcTemplate.update(sql,student.getSlno(),student.getFname(),student.getLname(),student.getPhnone());
		
	}
	
}
