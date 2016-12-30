package hello;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
    basePackageClasses = AppConfigAutoScan.class
    )
public class AppConfigAutoScan {
}
