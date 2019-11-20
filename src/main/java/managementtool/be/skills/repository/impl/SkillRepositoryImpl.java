package managementtool.be.skills.repository.impl;

import managementtool.be.skills.model.Skill;
import managementtool.be.skills.repository.SkillRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile( "prod" )
public interface SkillRepositoryImpl extends CrudRepository<Skill, Long>,
                                             SkillRepository {

}
