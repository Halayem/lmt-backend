package managementtool.be.skills.controller;

import lombok.AllArgsConstructor;
import generated.managementtool.be.skills.api.SkillsApi;
import managementtool.be.skills.mapper.SkillMapper;
import generated.managementtool.be.skills.dto.Skills;
import managementtool.be.skills.service.SkillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class SkillsController implements SkillsApi {

    private SkillService skillService;

    @Override
    public ResponseEntity<Skills> skillsGet() {
        return ResponseEntity.ok( SkillMapper.mapModelToDto( skillService.getSkills() ) );
    }
}
