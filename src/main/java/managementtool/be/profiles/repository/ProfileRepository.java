package managementtool.be.profiles.repository;

import managementtool.be.profiles.model.Profile;

public interface ProfileRepository {

    Iterable<Profile> findAll();
}
