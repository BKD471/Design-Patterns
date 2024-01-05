package srp.bad_approach.dao;

import srp.bad_approach.entity.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserRepo {
    private final Map<UUID, User> USER_CONTAINER=new HashMap<>();

    public void store(User user){
        synchronized (USER_CONTAINER){
            USER_CONTAINER.put(UUID.randomUUID(),user);
        }
    }

    public User getUser(UUID uid){
        synchronized (USER_CONTAINER){
            if(USER_CONTAINER.containsKey(uid)) return USER_CONTAINER.get(uid);
            throw new RuntimeException("No Such User With this Id");
        }
    }
}
