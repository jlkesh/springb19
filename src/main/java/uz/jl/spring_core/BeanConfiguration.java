package uz.jl.spring_core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {

    @Bean(initMethod = "init")
    @Scope("prototype")
    public MessageServer messageServer() {
        return new MessageServer();
    }
}
