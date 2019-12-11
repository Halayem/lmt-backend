package managementtool.be.employee.controller;

import java.time.LocalDateTime;

import generated.managementtool.be.employee.api.ServiceProvidersApi;
import generated.managementtool.be.employee.dto.PersonalInformation;
import generated.managementtool.be.employee.dto.ResourceInformation;
import lombok.AllArgsConstructor;
import managementtool.be.commun.builder.ResourceInformationBuilder;
import managementtool.be.employee.mapper.EmployeeMapper;
import managementtool.be.employee.service.ProviderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
public class ProvidersController implements ServiceProvidersApi {

	private ProviderService providerService;

	@Override
	public ResponseEntity<PersonalInformation> serviceProvidersIdGet( Long id ) {

		return providerService
				.getEmployeePersonalInformationById( id )
				.map		(
								employee -> ResponseEntity.ok(
				       						EmployeeMapper.mapFromEmployeeToPersonalInformation( employee )
								)
							)
				.orElseGet	( () -> ResponseEntity.notFound().build() );
	}

	@Override
	public ResponseEntity<ResourceInformation> serviceProvidersPost(@Valid PersonalInformation personalInformation ) {
		return ResponseEntity.ok(
				new ResourceInformationBuilder().withId(
						providerService.saveEmployeePersonalInformation(
							EmployeeMapper.mapFromPersonalInformationToEmployeePersonalInformation(
									personalInformation
							)
						)
				).build()
		);
	}

	@CrossOrigin
	@GetMapping("/ping")
	public String pong() {
		return "Pong at " + LocalDateTime.now().toString();
	}
}
