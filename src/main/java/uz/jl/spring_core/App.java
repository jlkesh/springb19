package uz.jl.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.jl.spring_core.config.SpringIoCConfig;
import uz.jl.spring_core.properties.DbProperties;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringIoCConfig.class);
        DbProperties dbProperties = context.getBean(DbProperties.class);
        System.out.println("dbProperties = " + dbProperties);
    }
}
