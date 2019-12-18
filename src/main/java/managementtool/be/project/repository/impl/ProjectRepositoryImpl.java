package managementtool.be.project.repository.impl;

import managementtool.be.project.model.Project;
import managementtool.be.project.repository.ProjectRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepositoryImpl extends  CrudRepository<Project, Long>,
                                                ProjectRepository { }
