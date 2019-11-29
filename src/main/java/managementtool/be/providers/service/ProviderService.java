package managementtool.be.providers.service;

import managementtool.be.providers.model.Employee;

public interface ProviderService {

    /**
     *
     * @param employee
     * @return The employee id stored in database
     */
    Long savePersonalInformation( Employee employee );
}
