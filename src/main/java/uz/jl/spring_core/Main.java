package uz.jl.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConfigurer.xml");
        Performer performer = context.getBean(Performer.class);
        performer.perform();
    }
}
