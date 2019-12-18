package managementtool.be.project.repository;

import managementtool.be.project.model.Project;

import java.util.Optional;

public interface ProjectRepository {

    <S extends Project> S save(final S project );
    Optional<Project> findById( final Long id );
    Iterable<Project> findAll();
    Iterable<Project> findByEmployeeId( final Long idEmployee );
}
