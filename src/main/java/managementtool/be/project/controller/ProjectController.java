package managementtool.be.project.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import generated.managementtool.be.common.dto.ResourceInformation;
import generated.managementtool.be.project.api.ProjectsApi;
import generated.managementtool.be.project.dto.Project;
import lombok.AllArgsConstructor;
import lombok.Getter;
import managementtool.be.commun.builder.ResourceInformationBuilder;
import managementtool.be.project.mapper.ProjectMapper;
import managementtool.be.project.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Optional;

@AllArgsConstructor
@Getter
@RestController
public class ProjectController implements ProjectsApi {

    private final ProjectService                projectService;
    private final ProjectMapper                 projectMapper;
    private final Optional<ObjectMapper>        objectMapper;
    private final Optional<HttpServletRequest>  request;

    @Override
    public ResponseEntity<Project> projectsIdGet( Long id ) {
        return ResponseEntity.ok( projectService.getProjectById( id ) );
    }

    @Override
    public ResponseEntity<ResourceInformation> projectsPost( @Valid Project project ) {
        return ResponseEntity.ok(
                new ResourceInformationBuilder().withId(
                        projectService.saveProject( projectMapper.mapFromDtoToModel( project ),
                                                    project.getSkillIds     (),
                                                    project.getProfileIds   ()
                        )
                ).build()
        );
    }
}
