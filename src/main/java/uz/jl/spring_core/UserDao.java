package uz.jl.spring_core;

import lombok.ToString;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@ToString(doNotUseGetters = true)
@Lazy
public class UserDao {
    public UserDao() {
        System.out.println("UserDao empty initialization");
    }
}
