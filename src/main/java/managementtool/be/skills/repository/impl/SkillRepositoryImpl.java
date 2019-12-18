package managementtool.be.skills.repository.impl;

import managementtool.be.skills.model.Skill;
import managementtool.be.skills.repository.SkillRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepositoryImpl extends CrudRepository<Skill, Long>,
                                             SkillRepository {

}
