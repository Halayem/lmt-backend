package managementtool.be.project.repository.impl;

import managementtool.be.project.model.ProjectProfile;
import managementtool.be.project.repository.ProjectProfileRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile( "prod" )
public interface ProjectProfileRepositoryImpl extends   CrudRepository<ProjectProfile, Long>,
                                                        ProjectProfileRepository {
}
