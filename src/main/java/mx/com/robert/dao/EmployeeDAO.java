package mx.com.robert.dao;

import java.util.List;
import mx.com.robert.models.Employee;

public interface EmployeeDAO {

	public Employee findById(int id);

	public List<Employee> findAll();

	public void save(Employee employee);

	public void update(Employee employee);

	public void delete(int id);

}
