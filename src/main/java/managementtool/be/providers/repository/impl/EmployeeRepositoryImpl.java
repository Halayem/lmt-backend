package managementtool.be.providers.repository.impl;

import managementtool.be.providers.model.Employee;
import managementtool.be.providers.repository.EmployeeRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Profile( "prod" )
@Repository
public interface EmployeeRepositoryImpl extends CrudRepository<Employee, Long>,
                                                EmployeeRepository {
}
