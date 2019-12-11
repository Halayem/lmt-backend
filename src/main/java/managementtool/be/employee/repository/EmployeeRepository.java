package managementtool.be.employee.repository;

import managementtool.be.employee.model.Employee;

import java.util.Optional;

public interface EmployeeRepository {
    <S extends Employee>    S save  ( final S employee  );
    Optional<Employee>      findById( final Long id     );
}
