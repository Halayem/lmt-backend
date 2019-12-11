package managementtool.be.employee.service.impl;

import lombok.AllArgsConstructor;
import managementtool.be.employee.model.Employee;
import managementtool.be.employee.repository.EmployeeRepository;
import managementtool.be.employee.service.ProviderService;

import java.util.Optional;

@AllArgsConstructor
public class ProviderServiceImpl implements ProviderService {

    private EmployeeRepository employeeRepository;

    @Override
    public Long saveEmployeePersonalInformation( final Employee employee ) {
        return employeeRepository.save( employee ).getId();
    }

    @Override
    public Optional<Employee> getEmployeePersonalInformationById( final Long id) {
        return employeeRepository.findById( id );
    }
}
