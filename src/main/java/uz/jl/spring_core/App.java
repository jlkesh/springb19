package uz.jl.spring_core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
    public static void main(String[] args) {
//        Resource resource = new ClassPathResource("classpath:applicationConfigurer.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
////        UserService userService = (UserService) beanFactory.getBean("userService");
//        UserService userService = beanFactory.getBean(UserService.class);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationConfigurer.xml");
//        UserService userService = context.getBean(UserService.class);
//        System.out.println("userService = " + userService);
//        RoleDao bean = context.getBean("roleDao2", RoleDao.class);
//        System.out.println("bean = " + bean);
//        UserService user = context.getBean(UserService.class);
//        System.out.println("user = " + user);
        System.out.println("Hello");
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println("userDao = " + userDao);
        context.close();
    }
}
