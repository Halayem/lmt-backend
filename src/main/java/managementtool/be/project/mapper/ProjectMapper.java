package managementtool.be.project.mapper;

import managementtool.be.project.model.Project;

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
}
