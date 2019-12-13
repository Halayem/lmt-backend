package managementtool.be.project.configuration;

import managementtool.be.project.mapper.ProjectMapper;
import managementtool.be.project.repository.ProjectProfileRepository;
import managementtool.be.project.repository.ProjectRepository;
import managementtool.be.project.repository.ProjectSkillRepository;
import managementtool.be.project.service.ProjectService;
import managementtool.be.project.service.impl.ProjectServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    @Bean
    public ProjectMapper projectMapper() {
        return new ProjectMapper();
    }

    @Bean
    public ProjectService projectService( final ProjectRepository        projectRepository,
                                          final ProjectMapper            projectMapper,
                                          final ProjectSkillRepository   projectSkillRepository,
                                          final ProjectProfileRepository projectProfileRepository ) {

        return new ProjectServiceImpl(  projectRepository,
                                        projectMapper,
                                        projectSkillRepository,
                                        projectProfileRepository );
    }
}
