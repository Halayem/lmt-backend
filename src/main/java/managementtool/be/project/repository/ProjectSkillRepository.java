package managementtool.be.project.repository;

import managementtool.be.project.model.ProjectProfile;
import managementtool.be.project.model.ProjectSkill;

import java.util.List;

public interface ProjectSkillRepository {
    <S extends ProjectSkill> List<S>  saveAll( Iterable<S> projectSkills );
    <S extends ProjectSkill> Iterable <S> findByProjectId ( Long projectId );
}
