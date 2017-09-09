package trng.imcs.spring.mvc.dao;

import java.util.List;

import trng.imcs.spring.mvc.model.Department;

public interface DepartmentDAO {

	public Department getDepartment(int empId);

	public List<Department> getAllDepartments();

}
