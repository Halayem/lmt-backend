package managementtool.be.providers.configuration;

import managementtool.be.providers.repository.EmployeeRepository;
import managementtool.be.providers.service.ProviderService;
import managementtool.be.providers.service.impl.ProviderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProviderConfiguration {

    @Bean
    public ProviderService providerService( final EmployeeRepository employeeRepository ) {
        return new ProviderServiceImpl( employeeRepository );
    }
}
