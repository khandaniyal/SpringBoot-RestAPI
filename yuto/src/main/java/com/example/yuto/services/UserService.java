package com.example.yuto.services;

import com.example.yuto.models.User;
import com.example.yuto.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public ArrayList<User> getAllUsers(){ return (ArrayList<User>) userRepo.findAll(); }

    public User saveUser(User user){ return userRepo.save(user); }

    public Optional<User> getById(long id){ return userRepo.findById(id); }

    public ArrayList<User> getByPriority(int priority) { return userRepo.findByPriority(priority); }

    public boolean deleteUserById(long id){
        try {
            userRepo.deleteById(id);
            return true;
        }catch (Exception e){ return false; }
    }
}
