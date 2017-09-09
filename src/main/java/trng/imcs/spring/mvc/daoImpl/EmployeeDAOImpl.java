package trng.imcs.spring.mvc.daoImpl;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import trng.imcs.spring.mvc.configuration.ApplicationConfig;
import trng.imcs.spring.mvc.dao.EmployeeDAO;
import trng.imcs.spring.mvc.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	ApplicationConfig appConfig;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int addEmployee(Employee e) {
		int id = generateId();
		int res = jdbcTemplate.update(
				"insert into employee (id, name, username, password, age, dateOfBirth, dateOfJoining, salaryGrade, salary, deptId) values (?, ?, ?, ?, ?, ?, ?, ?, ?,?)",
				id, e.getName(), e.getUsername(), e.getPassword(), e.getAge(), e.getDateOfBirth(), e.getDateOfJoining(),
				e.getSalaryGrade(), e.getSalary(), e.getDeptId());
		if (res > 0) {
			return id;
		}
		return 0;
	}

	public int updateEmployee(Employee e) {
		return jdbcTemplate.update(
				"update employee set name=?, username=?, password=?, age=?, dateOfBirth=?, dateOfJoining=?, salaryGrade=?,salary=?, deptId=? where id =?",
				e.getName(), e.getUsername(), e.getPassword(), e.getAge(), e.getDateOfBirth(), e.getDateOfJoining(),
				e.getSalaryGrade(), e.getSalary(), e.getDeptId(), e.getId());
	}

	public int deleteEmployee(int empId) {
		return jdbcTemplate.update("delete from employee where id = ?", empId);
	}

	public Employee getEmployee(int empId) {
		try {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			Employee employee = (Employee) jdbcTemplate.queryForObject("SELECT * FROM employee where id = ? ",
					new Object[] { empId }, new BeanPropertyRowMapper(Employee.class));
			return employee;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}

	}

	public List<Employee> getAllEmployeesByDeptId(int deptId) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Employee> empList = jdbcTemplate.query("SELECT * FROM employee where deptId=?", new Object[] { deptId },
				new BeanPropertyRowMapper(Employee.class));
		return empList;
	}

	private int generateId() {
		final String sql = "SELECT MAX(id) FROM employee";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count + 1;
	}

}
