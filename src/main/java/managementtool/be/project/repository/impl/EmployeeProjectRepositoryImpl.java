package managementtool.be.project.repository.impl;

import managementtool.be.project.model.EmployeeProject;
import managementtool.be.project.repository.EmployeeProjectRepository;
import managementtool.be.skills.model.Skill;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile( "prod" )
public interface EmployeeProjectRepositoryImpl extends  CrudRepository<EmployeeProject, Long>,
                                                        EmployeeProjectRepository { }
