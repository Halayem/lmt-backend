package managementtool.be.skills.controller;

import managementtool.be.skills.api.SkillsApi;
import managementtool.be.skills.model.Skill;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillsController implements SkillsApi {
    @Override
    public ResponseEntity<Skill> skillsGet() {
        Skill skill = new Skill();
        skill.setId(1);
        skill.setName("java");
        return ResponseEntity.ok( skill );
    }
}
