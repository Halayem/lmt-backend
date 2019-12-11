package managementtool.be.employee.mapper;

import generated.managementtool.be.employee.dto.PersonalInformation;
import managementtool.be.employee.builder.dto.PersonalInformationBuilder;
import managementtool.be.employee.model.Employee;

public class EmployeeMapper {

    public static Employee mapFromPersonalInformationToEmployeePersonalInformation( final PersonalInformation personalInformation ) {
        return Employee.builder().firstname         ( personalInformation.getFirstname()    )
                                 .lastname          ( personalInformation.getLastname()     )
                                 .mailProfesional   ( personalInformation.getMail()         )
                                 .phoneNumber       ( personalInformation.getPhonenumber()  )
                                 .build             ();
    }

    public static PersonalInformation mapFromEmployeeToPersonalInformation ( final Employee employee ) {
        return new PersonalInformationBuilder().withFirstname   ( employee.getFirstname()       )
                                               .withLastname    ( employee.getLastname()        )
                                               .withMail        ( employee.getMailProfesional() )
                                               .withPhonenumber ( employee.getPhoneNumber()     )
                                               .withId          ( employee.getId()              )
                                               .build();
    }
}
