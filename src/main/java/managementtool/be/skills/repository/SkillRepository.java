package managementtool.be.skills.repository;

import managementtool.be.skills.model.Skill;

public interface SkillRepository {

    Iterable<Skill> findAll();
}
