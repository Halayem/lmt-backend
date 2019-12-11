package managementtool.be.employee.service;

import managementtool.be.employee.model.Employee;

import java.util.Optional;

public interface ProviderService {

    /**
     *
     * @param employee
     * @return The employee id stored in database
     */
    Long saveEmployeePersonalInformation( Employee employee );

    Optional<Employee> getEmployeePersonalInformationById ( Long id );
}
