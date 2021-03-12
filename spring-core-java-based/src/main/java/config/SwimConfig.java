package config;

import org.krish.spring.bean.Coach;
import org.krish.spring.bean.FortuneService;
import org.krish.spring.bean.SadFortuneService;
import org.krish.spring.bean.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwimConfig {

    @Bean
    public FortuneService sadFortuneService()
    {
        System.out.println("SwimConfig  :  Inside sadFortuneService()");
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach()
    {
        System.out.println("SwimConfig  :  Inside swimCoach()");
        return new SwimCoach(sadFortuneService());
    }
}
