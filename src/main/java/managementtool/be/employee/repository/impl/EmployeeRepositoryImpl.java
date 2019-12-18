package managementtool.be.employee.repository.impl;

import managementtool.be.employee.model.Employee;
import managementtool.be.employee.repository.EmployeeRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositoryImpl extends CrudRepository<Employee, Long>,
                                                EmployeeRepository {
}
