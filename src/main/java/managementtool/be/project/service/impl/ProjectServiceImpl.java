package managementtool.be.project.service.impl;

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

@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository         projectRepository;
    private final ProjectSkillRepository    projectSkillRepository;
    private final ProjectProfileRepository projectProfileRepository;

    @Override
    public Long saveProject( final Project project, final List<Long> skillIds, final List<Long> profileIds ) {
        final Long projectId = projectRepository.save( project ).getId();
        projectSkillRepository.saveAll  ( buildProjectSkills    ( projectId, skillIds     ) );
        projectProfileRepository.saveAll( buildProjectProfiles  ( projectId, profileIds   ) );
        return projectId;
    }

    @Override
    public generated.managementtool.be.project.dto.Project getProjectById ( Long projectId ) {
        return ProjectMapper.mapFromModelToDto( projectRepository.findById              ( projectId ),
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
