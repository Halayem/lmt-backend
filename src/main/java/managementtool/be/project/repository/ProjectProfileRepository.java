package managementtool.be.project.repository;

import managementtool.be.project.model.ProjectProfile;

import java.util.List;

public interface ProjectProfileRepository {
    <S extends ProjectProfile> List<S> saveAll( Iterable<S> projectProfiles );
    <S extends ProjectProfile> Iterable<S> findByProjectId ( Long projectId );
}
