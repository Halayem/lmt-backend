package managementtool.be.employee.repository.impl;

import managementtool.be.employee.model.Employee;
import managementtool.be.employee.repository.EmployeeRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Profile( "prod" )
@Repository
public interface EmployeeRepositoryImpl extends CrudRepository<Employee, Long>,
                                                EmployeeRepository {
}
