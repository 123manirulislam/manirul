package in.embryotechnology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJdbcWithOracleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootJdbcWithOracleApplication.class, args);
		
		
		
		StudentDao studentDao = container.getBean(StudentDao.class);
		System.out.println(studentDao.save(new Student(25, "manirul", "islam", 45626l)));
	
		System.out.println("record inserted");
		
	}

}
