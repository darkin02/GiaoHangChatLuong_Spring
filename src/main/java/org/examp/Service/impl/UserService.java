package org.examp.Service.impl;

import org.examp.Entitys.User;
import org.examp.Repository.UserRepository;
import org.examp.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public User getOne(int id) {
        return userRepository.findOne(id);
    }

}
