package managementtool.be.providers.repository;

import managementtool.be.providers.model.Employee;

public interface EmployeeRepository {
    <S extends Employee> S save(S user );
}
