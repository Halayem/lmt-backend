package managementtool.be.commun.builder;

import generated.managementtool.be.common.dto.ResourceInformation;

public class ResourceInformationBuilder {
    private final ResourceInformation resourceInformation = new ResourceInformation();

    public ResourceInformationBuilder withId( final Long id ) {
        resourceInformation.setId( id );
        return this;
    }

    public ResourceInformation build() { return resourceInformation; }
}
