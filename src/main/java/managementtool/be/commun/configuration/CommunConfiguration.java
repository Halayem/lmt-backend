package managementtool.be.commun.configuration;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import managementtool.be.commun.model.LmtProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


public class CommunConfiguration {

    @Configuration
    @AllArgsConstructor
    @Slf4j
    public static class CorsConfiguration implements WebMvcConfigurer {

        private final LmtProperties lmtProperties;

        @Override
        public void addCorsMappings( CorsRegistry corsRegistry ) {
            corsRegistry.addMapping         ( lmtProperties.getCors().getMapping()          )
                        .allowedOrigins     ( lmtProperties.getCors().getAllowedOrigins()   )
                        .allowedMethods     ( lmtProperties.getCors().getAllowedMethods()   )
                        .allowCredentials   ( lmtProperties.getCors().getAllowCredentials() ) ;
        }
    }
}
