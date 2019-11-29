package managementtool.be.providers.service;

import managementtool.be.providers.model.Employee;

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
