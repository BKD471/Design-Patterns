package solid.srps.good_approach;



import solid.srps.good_approach.entity.User;
import solid.srps.good_approach.controller.UserController;
import solid.srps.good_approach.dao.UserRepo;
import solid.srps.good_approach.validation.UserValidation;

import java.util.UUID;

public class Runner {
    private final UserController userController;
    Runner(UserController userController){
        this.userController = userController;
    }


    public static void main(String[] args) {
        User user=new User(UUID.randomUUID(),"Bhaskar Kumar Das",
                "bhaskarkumardas9@gmail.com");
        UserRepo userRepo=new UserRepo();
        UserValidation userValidation=new UserValidation();

        Runner runner=new Runner(new UserController(user,userValidation,userRepo));
        User createdUser=runner.userController.createUser(user);
        System.out.println(createdUser);
    }
}
