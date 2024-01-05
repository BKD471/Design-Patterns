package solid.srps.good_approach.controller;


import solid.srps.good_approach.dao.UserRepo;
import solid.srps.good_approach.entity.User;
import solid.srps.good_approach.validation.UserValidation;

public class UserController {
    private final User user;
    private final UserValidation userValidation;
    private final UserRepo userRepo;


    public UserController(User user,UserValidation userValidation,UserRepo userRepo){
        this.user=user;
        this.userValidation=userValidation;
        this.userRepo=userRepo;
    }

    public User createUser(User user){
        //validation checks
        if(!userValidation.isValidUser(user)) throw new RuntimeException("Invalid Input");
        //store in repo
        userRepo.store(user);
        return user;
    }

}
