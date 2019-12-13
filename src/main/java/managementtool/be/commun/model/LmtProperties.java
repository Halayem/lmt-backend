package managementtool.be.commun.model;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties( prefix = "lmt")
@Getter
@Setter
public class LmtProperties {

    private Cors cors;

    @Getter
    @Setter
    public static class Cors {
        private String      mapping;
        private String[]    allowedOrigins;
        private String[]    allowedMethods;
        private Boolean     allowCredentials;
    }
}
