package managementtool.be.providers.builder.dto;

import generated.managementtool.be.providers.dto.PersonalInformation;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PersonalInformationBuilder {
    private PersonalInformation personalInformation = new PersonalInformation();

    public PersonalInformationBuilder withId( final Long id ) {
        personalInformation.setId( id );
        return this;
    }

    public PersonalInformationBuilder withFirstname( final String firstname ) {
        personalInformation.setFirstname( firstname );
        return this;
    }

    public PersonalInformationBuilder withLastname( final String lastname) {
        personalInformation.setLastname( lastname );
        return this;
    }

    public PersonalInformationBuilder withMail( final String mail ) {
        personalInformation.setMail( mail );
        return this;
    }

    public PersonalInformationBuilder withPhonenumber( final String phonenumber ) {
        personalInformation.setPhonenumber( phonenumber );
        return this;
    }

    public PersonalInformation build() {
        return personalInformation;
    }
}
