package managementtool.be.providers.repository;

import managementtool.be.providers.model.Employee;

import java.util.Optional;

public interface EmployeeRepository {
    <S extends Employee> S save( S user );
    Optional<Employee> findById(final Long id );
}
