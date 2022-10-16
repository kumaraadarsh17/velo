package com.group_c.velo.controller;

import com.group_c.velo.entity.User;
import com.group_c.velo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    UserService userService;

    @GetMapping("/{rollNumber}")
    public ResponseEntity<User> getUser(@PathVariable Long rollNumber){
        User user = userService.getUser(rollNumber);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.getAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @DeleteMapping("/{rollNumber}")
    public ResponseEntity<HttpStatus> deleteBike(@PathVariable Long rollNumber){
        userService.deleteUser(rollNumber);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
