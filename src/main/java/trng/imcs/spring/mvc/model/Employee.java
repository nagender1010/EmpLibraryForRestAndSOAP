package trng.imcs.spring.mvc.model;

import java.util.Date;

public class Employee {

	private Integer id;
	private String name;
	private String username;
	private String password;
	private int age;
	private Date dateOfBirth;
	private Date dateOfJoining;
	private int salaryGrade;
	private float salary;
	private int deptId;

	public Employee() {
		super();
	}

	public Employee(String name, String username, String password, int age, Date dateOfBirth, Date dateOfJoining,
			int salaryGrade, float salary, int deptId) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.salaryGrade = salaryGrade;
		this.salary = salary;
		this.deptId = deptId;
	}

	public Employee(Integer id, String name, String username, String password, int age, Date dateOfBirth,
			Date dateOfJoining, int salaryGrade, float salary, int deptId) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.salaryGrade = salaryGrade;
		this.salary = salary;
		this.deptId = deptId;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getSalaryGrade() {
		return salaryGrade;
	}

	public void setSalaryGrade(int salaryGrade) {
		this.salaryGrade = salaryGrade;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", username=" + username + ", age=" + age + ", dateOfBirth="
				+ dateOfBirth + ", dateOfJoining=" + dateOfJoining + ", salaryGrade=" + salaryGrade + ", salary="
				+ salary + ", deptId=" + deptId + "]";
	}

}
