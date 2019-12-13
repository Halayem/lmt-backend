package managementtool.be.project.builder.dto;

import generated.managementtool.be.employee.dto.Enterprise;
import generated.managementtool.be.employee.dto.Project;

import java.time.LocalDate;
import java.util.List;

public class ProjectBuilder {

    private Project project = new Project();

    public ProjectBuilder withId ( final Long id ) {
        project.setId( id );
        return this;
    }

    public ProjectBuilder withEnterprise ( final Enterprise enterprise ) {
        project.setEnterprise( enterprise );
        return this;
    }

    public ProjectBuilder withEntitle ( final String entitle ) {
        project.setEntitle( entitle );
        return this;
    }

    public ProjectBuilder withDescription ( final String description ) {
        project.setDescription( description );
        return this;
    }

    public ProjectBuilder withStartDate ( final LocalDate startDate ) {
        project.setStartDate( startDate );
        return this;
    }

    public ProjectBuilder withEndDate ( final LocalDate endDate ) {
        project.setEndDate( endDate );
        return this;
    }

    public ProjectBuilder withSkillIds ( final List<Long> skillIds ) {
        project.setSkillIds( skillIds );
        return this;
    }

    public ProjectBuilder withProfileIds ( final List<Long> profileIds ) {
        project.setProfileIds( profileIds );
        return this;
    }

    public Project build() {
        return project;
    }
}
