package managementtool.be.project.repository;

import managementtool.be.project.model.Project;

public interface ProjectRepository {

    <S extends Project> S save(final S project );
    Iterable<Project> findAll();
}
