package trng.imcs.spring.mvc.repository;

import org.springframework.data.repository.CrudRepository;

import trng.imcs.spring.mvc.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
