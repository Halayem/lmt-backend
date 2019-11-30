package managementtool.be.profiles.service.impl;

import lombok.AllArgsConstructor;
import managementtool.be.profiles.model.Profile;
import managementtool.be.profiles.repository.ProfileRepository;
import managementtool.be.profiles.service.ProfileService;

@AllArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private ProfileRepository profileRepository;

    @Override
    public Iterable<Profile> getProfiles() {
        return profileRepository.findAll();
    }
}
