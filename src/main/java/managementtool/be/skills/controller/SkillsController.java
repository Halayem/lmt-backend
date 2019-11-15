package managementtool.be.skills.controller;

import managementtool.be.skills.api.SkillsApi;
import managementtool.be.skills.builder.SkillBuilder;
import managementtool.be.skills.model.Skills;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class SkillsController implements SkillsApi {
    @Override
    public ResponseEntity<Skills> skillsGet() {
        return ResponseEntity.ok( getSkills() );
    }

    private Skills getSkills() {
        Skills skills = new Skills();
        skills.addAll( Arrays.asList (
                new SkillBuilder().withId( 1 ).withName( "java"         ).build(),
                new SkillBuilder().withId( 2 ).withName( "angular"      ).build(),
                new SkillBuilder().withId( 3 ).withName( "nodejs"       ).build(),
                new SkillBuilder().withId( 4 ).withName( ".net"         ).build(),
                new SkillBuilder().withId( 5 ).withName( "springboot"   ).build()
        ) );
        return skills;
    }
}
