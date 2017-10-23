package mx.com.robert.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import mx.com.robert.models.Employee;

@Repository
public class EmployeeDAOImpl extends AbstractDAO implements EmployeeDAO {

	@Override
	public void save(Employee employee) {
		super.persist(employee);
	}

	@Override
	public Employee findById(int id) {
		Employee employee = (Employee) super.getSession().createQuery("FROM EMPLEADO WHERE id = :id")
				.setParameter("id", id)
				.uniqueResult();
		return employee;
	}

	@Override
	public List<Employee> findAll() {
		@SuppressWarnings("unchecked")
		List<Employee> listEmployee = (List<Employee>) super.getSession().createQuery("FROM EMPLEADO")
		.getResultList();
		return listEmployee;
	}

	@Override
	public void update(Employee employee) {
		getSession().update(employee);
	}

	@Override
	public void delete(int id) {
		Employee employee = new Employee();
		employee.setId(id);
		super.getSession().delete(employee);

	}

}
