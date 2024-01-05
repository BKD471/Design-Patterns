package srp.bad_approach.controllers;

import srp.bad_approach.dao.UserRepo;
import srp.bad_approach.entity.User;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class UserController {
    private final UserRepo userRepo;
    private final User user;
    public UserController(UserRepo userRepo,User user){
        this.user=user;
        this.userRepo=userRepo;
    }

    public User createUser(User user){
        //validation checks
        if(!isValidUser(user)) throw new RuntimeException("Invalid Input");
        //store in repo
        userRepo.store(user);
        return user;
    }


    private boolean isValidUser(User user){
        // null checks
        if(Objects.isNull(user)) return false;
        if(StringUtils.isBlank(user.getEmail())) return false;
        if(StringUtils.isBlank(user.getName())) return  false;
        if(Objects.isNull(user.getUserId())) return false;
        return true;
    }

}
