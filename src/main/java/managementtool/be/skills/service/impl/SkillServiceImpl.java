package managementtool.be.skills.service.impl;

import lombok.AllArgsConstructor;
import managementtool.be.skills.model.Skill;
import managementtool.be.skills.repository.SkillRepository;
import managementtool.be.skills.service.SkillService;

@AllArgsConstructor
public class SkillServiceImpl implements SkillService {

    private SkillRepository skillRepository;

    @Override
    public Iterable<Skill> getSkills() {
        return skillRepository.findAll();
    }
}
