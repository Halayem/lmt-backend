package managementtool.be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class LansrodManagementToolBackendApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(LansrodManagementToolBackendApplication.class, args);
    }
}
