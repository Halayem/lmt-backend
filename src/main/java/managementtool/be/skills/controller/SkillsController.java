package managementtool.be.skills.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import generated.managementtool.be.skill.api.SkillsApi;
import generated.managementtool.be.skill.dto.Skills;
import lombok.AllArgsConstructor;
import lombok.Getter;
import managementtool.be.skills.mapper.SkillMapper;
import managementtool.be.skills.service.SkillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@AllArgsConstructor
@Getter
@RestController
public class SkillsController implements SkillsApi {

    private final SkillService                  skillService;
    private final SkillMapper                   skillMapper;
    private final Optional<ObjectMapper>        objectMapper;
    private final Optional<HttpServletRequest>  request;

    @Override
    public ResponseEntity<Skills> skillsGet() {
        return ResponseEntity.ok( skillMapper.mapModelToDto( skillService.getSkills() ) );
    }
}
