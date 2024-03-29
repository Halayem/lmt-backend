package managementtool.be.project.service.impl;

import generated.managementtool.be.project.dto.Projects;
import lombok.AllArgsConstructor;
import managementtool.be.project.mapper.ProjectMapper;
import managementtool.be.project.model.Project;
import managementtool.be.project.model.ProjectProfile;
import managementtool.be.project.model.ProjectSkill;
import managementtool.be.project.repository.ProjectProfileRepository;
import managementtool.be.project.repository.ProjectRepository;
import managementtool.be.project.repository.ProjectSkillRepository;
import managementtool.be.project.service.ProjectService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository         projectRepository;
    private final ProjectMapper             projectMapper;
    private final ProjectSkillRepository    projectSkillRepository;
    private final ProjectProfileRepository  projectProfileRepository;

    @Override
    public Long saveProject( final Project project, final List<Long> skillIds, final List<Long> profileIds ) {
        final Long projectId = projectRepository.save( project ).getId();
        projectSkillRepository.saveAll  ( buildProjectSkills    ( projectId, skillIds     ) );
        projectProfileRepository.saveAll( buildProjectProfiles  ( projectId, profileIds   ) );
        return projectId;
    }

    @Override
    public List<generated.managementtool.be.project.dto.Project> getProjectsByEmployeeId( final Long employeeId ) {
        return
            StreamSupport
            .stream ( projectRepository.findByEmployeeId( employeeId ).spliterator(), false )
            .map    ( project -> projectMapper.mapFromModelToDto( projectRepository.findById              ( project.getId() ),
                                                                  projectSkillRepository.findByProjectId  ( project.getId() ),
                                                                  projectProfileRepository.findByProjectId( project.getId() ) ) )
            .collect( Collectors.toList() );
    }

    @Override
    public generated.managementtool.be.project.dto.Project getProjectById ( Long projectId ) {
        return projectMapper.mapFromModelToDto( projectRepository.findById              ( projectId ),
                                                projectSkillRepository.findByProjectId  ( projectId ),
                                                projectProfileRepository.findByProjectId( projectId )
        );
    }

    private List<ProjectSkill> buildProjectSkills( final Long projectId, final List<Long> skillIds ) {
        return skillIds.stream().map( skillId -> ProjectSkill.builder   ()
                                                             .projectId ( projectId )
                                                             .skillId   ( skillId   )
                                                             .build     ()
                                    ).collect( Collectors.toList() );
    }

    private List<ProjectProfile> buildProjectProfiles( final Long projectId, final List<Long> profileIds ) {
        return profileIds.stream().map( profileId -> ProjectProfile.builder   ()
                                                                   .projectId ( projectId )
                                                                   .profileId ( profileId )
                                                                   .build     ()
                                      ).collect( Collectors.toList() );
    }
}
