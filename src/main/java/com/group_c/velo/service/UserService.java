package com.group_c.velo.service;

import com.group_c.velo.entity.User;

import java.util.List;

public interface UserService {
    User getUser(Long rollNumber);
    User saveUser(User user);
    void deleteUser(Long rollNumber);
    List<User> getAllUser();
}
