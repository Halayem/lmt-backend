package managementtool.be.profiles.configuration;

import managementtool.be.profiles.repository.ProfileRepository;
import managementtool.be.profiles.service.ProfileService;
import managementtool.be.profiles.service.impl.ProfileServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProfileConfiguration {

    @Bean
    public ProfileService profileService( final ProfileRepository profileRepository ) {
        return new ProfileServiceImpl( profileRepository );
    }
}
