package managementtool.be;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LansrodManagementToolBackendApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run( LansrodManagementToolBackendApplication.class, args );
    }
}
