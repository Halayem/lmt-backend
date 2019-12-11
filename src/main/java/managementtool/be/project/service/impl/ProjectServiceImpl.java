package managementtool.be.project.service.impl;

import lombok.AllArgsConstructor;
import managementtool.be.project.model.Project;
import managementtool.be.project.repository.ProjectRepository;
import managementtool.be.project.service.ProjectService;

@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    @Override
    public Long saveProject( final Project project ) {
        return projectRepository.save( project ).getId();
    }
}
