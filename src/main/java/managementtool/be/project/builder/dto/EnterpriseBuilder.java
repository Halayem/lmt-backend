package managementtool.be.project.builder.dto;

import generated.managementtool.be.project.dto.Enterprise;

public class EnterpriseBuilder {

    private final Enterprise enterprise = new Enterprise();

    public EnterpriseBuilder withId( final Long id ) {
        enterprise.setId( id );
        return this;
    }

    public EnterpriseBuilder withName( final String name ) {
        enterprise.setName( name );
        return this;
    }

    public Enterprise build() {
        return enterprise;
    }
}
