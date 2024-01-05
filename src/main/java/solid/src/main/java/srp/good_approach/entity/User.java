package srp.good_approach.entity;

import java.util.UUID;

public class User {
    private final UUID userId;
    private final String name;
    private final String email;

    public User(UUID userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
