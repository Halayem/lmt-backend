package managementtool.be.project.mapper;

import managementtool.be.project.builder.dto.EnterpriseBuilder;
import managementtool.be.project.builder.dto.ProjectBuilder;
import managementtool.be.project.model.Enterprise;
import managementtool.be.project.model.Project;
import managementtool.be.project.model.ProjectProfile;
import managementtool.be.project.model.ProjectSkill;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ProjectMapper {

    public static Project mapFromDtoToModel( final generated.managementtool.be.project.dto.Project projectDto ) {
        return Project.builder().id             ( projectDto.getId()                    )
                                .entitle        ( projectDto.getEntitle()               )
                                .startDate      ( projectDto.getStartDate()             )
                                .endDate        ( projectDto.getEndDate()               )
                                .description    ( projectDto.getDescription()           )
                                .enterprise     ( Enterprise.builder()
                                                            .id     ( projectDto.getEnterprise()
                                                                                .getId() )
                                                            .build  ())
                                .employeeId     ( projectDto.getEmployeeId()            )
                                .build          ();
    }

    public static generated.managementtool.be.project.dto.Project mapFromModelToDto( final Optional<Project>        project,
                                                                                     final Iterable<ProjectSkill>   projectSkills,
                                                                                     final Iterable<ProjectProfile> projectProfiles ) {
        return project.map (
            project1 -> new ProjectBuilder().withId          ( project1.getId()             )
                                            .withEntitle     ( project1.getEntitle()        )
                                            .withDescription ( project1.getDescription()    )
                                            .withStartDate   ( project1.getStartDate()      )
                                            .withEndDate     ( project1.getEndDate()        )
                                            .withEnterprise  ( new EnterpriseBuilder()
                                                                   .withId     ( project1.getEnterprise().getId()   )
                                                                   .withName   ( project1.getEnterprise().getName() )
                                                                   .build      () )
                                            .withSkillIds    (
                                                        StreamSupport.stream ( projectSkills.spliterator(),false )
                                                                     .map    ( projectSkill -> projectSkill.getSkillId() )
                                                                     .collect( Collectors.toList() ) )
                                            .withProfileIds  ( StreamSupport.stream ( projectProfiles.spliterator(), false )
                                                                            .map    ( projectProfile -> projectProfile.getProfileId() )
                                                                            .collect ( Collectors.toList() ) )
                                            .build()
        ).orElse( null );
    }
}
