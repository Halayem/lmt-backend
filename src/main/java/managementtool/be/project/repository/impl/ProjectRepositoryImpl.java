package managementtool.be.project.repository.impl;

import managementtool.be.project.model.Project;
import managementtool.be.project.repository.ProjectRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile( "prod" )
public interface ProjectRepositoryImpl extends  CrudRepository<Project, Long>,
                                                ProjectRepository { }
