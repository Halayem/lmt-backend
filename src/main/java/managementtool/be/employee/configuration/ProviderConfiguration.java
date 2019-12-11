package managementtool.be.employee.configuration;

import managementtool.be.employee.repository.EmployeeRepository;
import managementtool.be.employee.service.ProviderService;
import managementtool.be.employee.service.impl.ProviderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProviderConfiguration {

    @Bean
    public ProviderService providerService( final EmployeeRepository employeeRepository ) {
        return new ProviderServiceImpl( employeeRepository );
    }
}
