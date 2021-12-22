package com.example.yuto.repositories;

import com.example.yuto.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    public abstract ArrayList<User> findByPriority(long priority);
}
