package managementtool.be.profiles.builder;

import generated.managementtool.be.profile.dto.Profile;

public class ProfileBuilder {

    private Profile profile = new Profile();

    public ProfileBuilder withId( final Long id ) {
        profile.setId( id );
        return this;
    }

    public ProfileBuilder withName( final String name ) {
        profile.setName( name );
        return this;
    }

    public Profile build() {
        return profile;
    }
}
