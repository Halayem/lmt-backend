package managementtool.be.skills.builder;

import generated.managementtool.be.skill.dto.Skill;

public class SkillBuilder {

    private Skill skill = new Skill();

    public SkillBuilder withId( Long id ) {
        skill.setId( id );
        return this;
    }

    public SkillBuilder withName( String name ) {
        skill.setName( name );
        return this;
    }

    public Skill build() {
        return skill;
    }
}
