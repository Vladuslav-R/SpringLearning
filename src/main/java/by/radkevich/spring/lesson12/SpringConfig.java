package by.radkevich.spring.lesson12;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@ComponentScan
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
