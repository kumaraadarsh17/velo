package com.group_c.velo.service;

import com.group_c.velo.entity.User;
import com.group_c.velo.exception.EntityNotFoundException;
import com.group_c.velo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImplementation implements UserService {
    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User getUser(Long rollNumber) {
        Optional<User> user = userRepository.findById(rollNumber);
        if(user.isPresent()){
            return user.get();
        }
        else throw new EntityNotFoundException(rollNumber, User.class);
    }

    @Override
    public User saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
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
