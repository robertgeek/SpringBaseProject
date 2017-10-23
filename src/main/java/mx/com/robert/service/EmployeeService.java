package mx.com.robert.service;

import java.util.List;

import mx.com.robert.models.Employee;

public interface EmployeeService {

	public Employee findById(int id);

	public List<Employee> findAll();

	public void save(Employee employee);

	public void update(Employee employee);

	public void delete(int id);
}
