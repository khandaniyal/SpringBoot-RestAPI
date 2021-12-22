package com.example.yuto.controllers;

import com.example.yuto.models.User;
import com.example.yuto.services.UserService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UseController {

    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<User> getAllUsers(){ return userService.getAllUsers(); }

    @PostMapping()
    public User saveUser(@RequestBody User user){ return  this.userService.saveUser(user);}

    @GetMapping(path = "/{id}")
    public Optional<User> getUserById(@PathVariable("id") long id){
        return this.userService.getById(id);
    }

    @GetMapping("/query")
    public ArrayList<User> getUserByPriority(@RequestParam("priority") int priority){
        return this.userService.getByPriority(priority);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUserById(@PathVariable("id") long id){
        boolean deleted = userService.deleteUserById(id);
        if(deleted) return "The user with id=" + id + " has been deleted successfully.";
        else return "The user with id=" + id + " was not deleted";
    }
}
