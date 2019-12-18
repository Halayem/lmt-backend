package managementtool.be.project.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import generated.managementtool.be.common.dto.ResourceInformation;
import generated.managementtool.be.project.api.ProjectsApi;
import generated.managementtool.be.project.dto.Project;
import generated.managementtool.be.project.dto.Projects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import managementtool.be.commun.builder.ResourceInformationBuilder;
import managementtool.be.project.mapper.ProjectMapper;
import managementtool.be.project.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
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
    public ResponseEntity<Project> employeesIdEmployeeProjectsIdProjectGet(final Long idEmployee, final Long idProject )  {
        return ResponseEntity.ok( projectService.getProjectById( idProject ) );
    }

    @Override
    public ResponseEntity<Projects> employeesIdProjectsGet( final Long idEmployee ) {
        Projects projects = new Projects();
        projects.addAll( projectService.getProjectsByEmployeeId( idEmployee ) );
        return ResponseEntity.ok( projects );
    }

    @Override
    public ResponseEntity<ResourceInformation> employeesIdProjectsPost(final Long employeeId, @Valid final Project project) {
        return ResponseEntity.ok(
                new ResourceInformationBuilder().withId(
                        projectService.saveProject(
                                projectMapper.mapFromDtoToModel( employeeId, project ),
                                project.getSkillIds     (),
                                project.getProfileIds   ()
                        )
                ).build()
        );
    }
}
