package managementtool.be.project.mapper;

import managementtool.be.project.builder.dto.EnterpriseBuilder;
import managementtool.be.project.builder.dto.ProjectBuilder;
import managementtool.be.project.model.Project;

import java.util.List;

public class ProjectMapper {

    public static Project mapFromDtoToModel( final generated.managementtool.be.project.dto.Project projectDto ) {
        return Project.builder().id             ( projectDto.getId()                    )
                                .entitle        ( projectDto.getEntitle()               )
                                .startDate      ( projectDto.getStartDate()             )
                                .endDate        ( projectDto.getEndDate()               )
                                .description    ( projectDto.getDescription()           )
                                .enterpriseId   ( projectDto.getEnterprise().getId()    )
                                .employeeId     ( projectDto.getEmployeeId()            )
                                .build          ();
    }

    public static generated.managementtool.be.project.dto.Project mapFromModelToDto ( final Project project,
                                                                                      final List<Long> skillIds,
                                                                                      final List<Long> profileIds ) {
        return new ProjectBuilder().withId          ( project.getId()           )
                                   .withEntitle     ( project.getEntitle()      )
                                   .withStartDate   ( project.getStartDate()    )
                                   .withEndDate     ( project.getEndDate()      )
                                   .withDescription ( project.getDescription()  )
                                   .withSkillIds    ( skillIds                  )
                                   .withProfileIds  ( profileIds                )
                                   .withEnterprise  ( new EnterpriseBuilder().withId( project.getEnterpriseId() )
                                                                             .build () )
                                   .build           ();
    }
}
