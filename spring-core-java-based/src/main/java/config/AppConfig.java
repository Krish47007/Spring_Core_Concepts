package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.krish.spring.java") //same as context:component-scan in xml
public class AppConfig {
}
