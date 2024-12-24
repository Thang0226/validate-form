package com.repository;

import com.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository implements IUserRepository {
    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }
    @Override
    public void save(User user) {
        users.add(user);
        System.out.println("User added");
    }
}
