package trng.imcs.spring.mvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import trng.imcs.spring.mvc.model.Employee;

public interface EmployeeDAO {

	public int addEmployee(Employee e);

	public int updateEmployee(Employee e);

	public int deleteEmployee(int empId);

	public Employee getEmployee(int empId);

	public List<Employee> getAllEmployeesByDeptId(int deptId);
	
	

}
