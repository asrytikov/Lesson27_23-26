package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    People people(){
        var p = new People();
        p.setName("Alex");
        return p;
    }
}
