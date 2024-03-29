package managementtool.be.skills.mapper;

import managementtool.be.skills.builder.SkillBuilder;
import managementtool.be.skills.model.Skill;
import generated.managementtool.be.skill.dto.Skills;

public class SkillMapper {

    public Skills mapModelToDto( final Iterable<Skill> skillModels ) {
        Skills skills = new Skills();
        for ( Skill skillModel: skillModels ) {
            skills.add( new SkillBuilder().withId   ( skillModel.getId()    )
                                          .withName ( skillModel.getName()  )
                                          .build    () );
        }
        return skills;
    }
}
