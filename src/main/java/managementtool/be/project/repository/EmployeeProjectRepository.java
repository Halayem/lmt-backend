package managementtool.be.project.repository;

import managementtool.be.project.model.EmployeeProject;

public interface EmployeeProjectRepository {

    <S extends EmployeeProject> S save( final S employeeProject );
    Iterable<EmployeeProject> findAll();
}
