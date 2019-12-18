package managementtool.be.project.repository.impl;

import managementtool.be.project.model.ProjectSkill;
import managementtool.be.project.repository.ProjectSkillRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectSkillRepositoryImpl extends CrudRepository<ProjectSkill, Long>,
                                                    ProjectSkillRepository {
}
