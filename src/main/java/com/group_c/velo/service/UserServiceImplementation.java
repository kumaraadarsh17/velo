package com.group_c.velo.service;

import com.group_c.velo.entity.User;
import com.group_c.velo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImplementation implements UserService {
    UserRepository userRepository;


    @Override
    public User getUser(Long rollNumber) {
        Optional<User> user = userRepository.findById(rollNumber);
        if(user.isPresent()){
            return user.get();
        }
        //TODO: implement an exception for user not found
        else return null;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long rollNumber) {
        userRepository.deleteById(rollNumber);
    }

    @Override
    public List<User> getAllUser() {
        return (List<User>) userRepository.findAll();
    }
}
