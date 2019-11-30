package managementtool.be.profiles.repository.impl;

import managementtool.be.profiles.repository.ProfileRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile( "prod" )
public interface ProfileRepositoryImpl extends  CrudRepository<managementtool.be.profiles.model.Profile, Long>,
                                                ProfileRepository {

}
