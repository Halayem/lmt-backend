package managementtool.be.employee.mapper;

import generated.managementtool.be.employee.dto.PersonalInformation;
import lombok.NoArgsConstructor;
import managementtool.be.employee.builder.dto.PersonalInformationBuilder;
import managementtool.be.employee.model.Employee;

@NoArgsConstructor
public class EmployeeMapper {

    public Employee mapFromPersonalInformationToEmployeePersonalInformation( final PersonalInformation personalInformation ) {
        return Employee.builder().firstname         ( personalInformation.getFirstname()    )
                                 .lastname          ( personalInformation.getLastname()     )
                                 .mailProfesional   ( personalInformation.getMail()         )
                                 .phoneNumber       ( personalInformation.getPhonenumber()  )
                                 .build             ();
    }

    public PersonalInformation mapFromEmployeeToPersonalInformation ( final Employee employee ) {
        return new PersonalInformationBuilder().withFirstname   ( employee.getFirstname()       )
                                               .withLastname    ( employee.getLastname()        )
                                               .withMail        ( employee.getMailProfesional() )
                                               .withPhonenumber ( employee.getPhoneNumber()     )
                                               .withId          ( employee.getId()              )
                                               .build();
    }
}
