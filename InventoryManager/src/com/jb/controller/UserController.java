package com.jb.controller;

import com.jb.entity.User;

public class UserController {
    public String role;
    public User login(String username, String password) {
        // TODO: If username in database check password, if password is correct return user object
        //  with params from database
        String role; // TODO: Get role from database
        int employeeId; // TODO: Get employeeId from database
        return new User(username, password, "role", 0   );

    }

    /*private User authenticateUser(User user) {
        return user;
    }*/



}
