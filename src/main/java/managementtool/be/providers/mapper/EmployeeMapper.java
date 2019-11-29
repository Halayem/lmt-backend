package managementtool.be.providers.mapper;

import generated.managementtool.be.providers.dto.PersonalInformation;
import managementtool.be.providers.model.Employee;

public class EmployeeMapper {

    public static Employee mapFromPersonalInformationToEmployeePersonalInformation( final PersonalInformation personalInformation ) {
        return Employee.builder().firstname     ( personalInformation.getFirstname()    )
                             .lastname          ( personalInformation.getLastname()     )
                             .mailProfesional   ( personalInformation.getMail()         )
                             .phoneNumber       ( personalInformation.getPhonenumber()  )
                             .build             ();
    }
}
