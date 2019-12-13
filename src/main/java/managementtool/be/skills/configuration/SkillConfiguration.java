package managementtool.be.skills.configuration;

import managementtool.be.skills.mapper.SkillMapper;
import managementtool.be.skills.repository.SkillRepository;
import managementtool.be.skills.service.SkillService;
import managementtool.be.skills.service.impl.SkillServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SkillConfiguration {

    @Bean
    public SkillMapper skillMapper() {
        return new SkillMapper();
    }

    @Bean
    public SkillService skillService( final SkillRepository skillRepository ) {
        return new SkillServiceImpl( skillRepository );
    }
}
