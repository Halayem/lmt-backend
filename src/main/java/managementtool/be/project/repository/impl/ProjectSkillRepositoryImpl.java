package managementtool.be.project.repository.impl;

import managementtool.be.project.model.ProjectSkill;
import managementtool.be.project.repository.ProjectSkillRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile( "prod" )
public interface ProjectSkillRepositoryImpl extends CrudRepository<ProjectSkill, Long>,
                                                    ProjectSkillRepository {
}
