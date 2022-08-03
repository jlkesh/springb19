package uz.jl.spring_core;


import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class UserService {

//    @Autowired
//    private UserDao userDao;
//
//    @Autowired
//    private RoleDao roleDao;



    private final UserDao userDao;


    private final RoleDao roleDao;


    public UserService(
            @Lazy UserDao userDao,
            @Lazy RoleDao roleDao) {
        this.userDao = userDao;
        this.roleDao = roleDao;
    }

//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
//
//    @Autowired
//    public void setRoleDao(RoleDao roleDao) {
//        this.roleDao = roleDao;
//    }
}
