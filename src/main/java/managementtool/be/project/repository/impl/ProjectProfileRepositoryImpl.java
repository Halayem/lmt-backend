package managementtool.be.project.repository.impl;

import managementtool.be.project.model.ProjectProfile;
import managementtool.be.project.repository.ProjectProfileRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectProfileRepositoryImpl extends   CrudRepository<ProjectProfile, Long>,
                                                        ProjectProfileRepository {
}
