package managementtool.be.skills.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import generated.managementtool.be.skills.api.SkillsApi;
import lombok.Getter;
import managementtool.be.skills.mapper.SkillMapper;
import generated.managementtool.be.skills.dto.Skills;
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
    private final Optional<ObjectMapper>        objectMapper;
    private final Optional<HttpServletRequest>  request;

    @Override
    public ResponseEntity<Skills> skillsGet() {
        return ResponseEntity.ok( SkillMapper.mapModelToDto( skillService.getSkills() ) );
    }
}
