package managementtool.be.profiles.mapper;

import generated.managementtool.be.profile.dto.Profiles;
import managementtool.be.profiles.builder.ProfileBuilder;
import managementtool.be.profiles.model.Profile;

public class ProfileMapper {

    public static Profiles mapModelToDto( final Iterable<Profile> mProfiles ) {
        Profiles profiles = new Profiles();
        for ( Profile mProfile: mProfiles ) {
            profiles.add(
                    new ProfileBuilder().withId   ( mProfile.getId()    )
                                        .withName ( mProfile.getName()  )
                                        .build    () );
        }
        return profiles;
    }
}
