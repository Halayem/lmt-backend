package managementtool.be.employee.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import generated.managementtool.be.common.dto.ResourceInformation;
import generated.managementtool.be.employee.api.EmployeesApi;
import generated.managementtool.be.employee.dto.PersonalInformation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import managementtool.be.commun.builder.ResourceInformationBuilder;
import managementtool.be.employee.mapper.EmployeeMapper;
import managementtool.be.employee.service.ProviderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Optional;

@AllArgsConstructor
@Getter
@RestController
public class EmployeesController implements EmployeesApi {

	private final ProviderService 				providerService;
	private final Optional<ObjectMapper> 		objectMapper;
	private final Optional<HttpServletRequest>  request;

	@Override
	public ResponseEntity<PersonalInformation> employeesIdGet( Long id ) {

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
	public ResponseEntity<ResourceInformation> employeesPost(@Valid PersonalInformation personalInformation ) {
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
