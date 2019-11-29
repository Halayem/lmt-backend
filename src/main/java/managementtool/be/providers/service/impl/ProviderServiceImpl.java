package managementtool.be.providers.service.impl;

import lombok.AllArgsConstructor;
import managementtool.be.providers.model.Employee;
import managementtool.be.providers.repository.EmployeeRepository;
import managementtool.be.providers.service.ProviderService;

@AllArgsConstructor
public class ProviderServiceImpl implements ProviderService {

    private EmployeeRepository employeeRepository;

    @Override
    public Long savePersonalInformation( final Employee employee ) {
        return employeeRepository.save( employee ).getId();
    }
}
