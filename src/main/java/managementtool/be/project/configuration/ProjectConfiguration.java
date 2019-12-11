package managementtool.be.project.configuration;

import managementtool.be.project.repository.ProjectRepository;
import managementtool.be.project.service.ProjectService;
import managementtool.be.project.service.impl.ProjectServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    @Bean
    public ProjectService projectService( final ProjectRepository projectRepository ) {
        return new ProjectServiceImpl( projectRepository );
    }
}
