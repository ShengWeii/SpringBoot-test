package com.springboot.test.User.Service;

import com.springboot.test.User.Enity.User;
import com.springboot.test.User.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findOne(String account){

        return  userRepository.findByAccount(account);
    }

    public void add(User user){
        userRepository.save(user);
    }
}
