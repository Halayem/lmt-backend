package managementtool.be.profiles.service;

import managementtool.be.profiles.model.Profile;

public interface ProfileService {
    Iterable<Profile> getProfiles();
}
