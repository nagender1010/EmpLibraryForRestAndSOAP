package trng.imcs.core;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import trng.imcs.spring.mvc.configuration.ApplicationConfig;
import trng.imcs.spring.mvc.dao.DepartmentDAO;
import trng.imcs.spring.mvc.dao.EmployeeDAO;
import trng.imcs.spring.mvc.daoImpl.DepartmentDAOImpl;
import trng.imcs.spring.mvc.daoImpl.EmployeeDAOImpl;
import trng.imcs.spring.mvc.model.Employee;
import trng.imcs.spring.mvc.repository.EmployeeRepository;

@SpringBootApplication
public class EmpLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpLibraryApplication.class);

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		EmployeeDAO dao = (EmployeeDAOImpl) context.getBean(EmployeeDAOImpl.class);
		
	}

	
}
