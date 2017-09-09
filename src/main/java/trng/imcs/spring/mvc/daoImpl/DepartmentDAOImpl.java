package trng.imcs.spring.mvc.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import trng.imcs.spring.mvc.dao.DepartmentDAO;
import trng.imcs.spring.mvc.dao.EmployeeDAO;
import trng.imcs.spring.mvc.model.Department;
import trng.imcs.spring.mvc.model.Employee;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Department getDepartment(int deptId) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Department dept = (Department) jdbcTemplate.queryForObject("SELECT * FROM department where id = ? ",
				new Object[] { deptId }, new BeanPropertyRowMapper(Department.class));
		return dept;
	}

	@Override
	public List<Department> getAllDepartments() {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Department> deptList = jdbcTemplate.query("SELECT * FROM department",
				new BeanPropertyRowMapper(Department.class));
		return deptList;
	}

}
