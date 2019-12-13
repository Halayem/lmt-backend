package managementtool.be.project.service;

import managementtool.be.project.model.Project;

import java.util.List;

public interface ProjectService {

    Long saveProject( Project project, List<Long> skillIds , List<Long> profileIds );
    generated.managementtool.be.employee.dto.Project getProjectById ( Long projectId );
}
