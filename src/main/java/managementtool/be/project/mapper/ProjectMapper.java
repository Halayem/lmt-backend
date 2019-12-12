package managementtool.be.project.mapper;

import managementtool.be.project.builder.dto.EnterpriseBuilder;
import managementtool.be.project.builder.dto.ProjectBuilder;
import managementtool.be.project.model.Enterprise;
import managementtool.be.project.model.Project;

import java.util.List;

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
}
