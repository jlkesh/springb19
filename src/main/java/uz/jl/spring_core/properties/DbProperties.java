package uz.jl.spring_core.properties;


import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ToString
@PropertySource("classpath:application.properties")
public class DbProperties {

    @Value("${database.username}")
    private String username;

    @Value("${database.password}")
    private String password;

    @Value("${database.password2:holahola}")
    private String password2;
}
