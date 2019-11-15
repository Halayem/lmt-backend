package managementtool.be.skills.builder;

import lombok.Builder;
import managementtool.be.skills.model.Skill;

public class SkillBuilder {

    private Skill skill = new Skill();

    public SkillBuilder withId( Integer id ) {
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
