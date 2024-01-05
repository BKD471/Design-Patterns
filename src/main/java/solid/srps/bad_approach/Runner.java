package solid.srps.bad_approach;

import solid.srps.bad_approach.controllers.UserController;
import solid.srps.bad_approach.dao.UserRepo;
import solid.srps.bad_approach.entity.User;

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

        Runner runner=new Runner(new UserController(userRepo,user));
        User createdUser=runner.userController.createUser(user);
        System.out.println(createdUser);
    }
}
