package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//Used to mark a class as the service provider.
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Autowired
    //Used to inject the dependency automatically.
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    //Used to override the parent class method, and to notify the mistakes.
    public User saveUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public User getUser(int id) {
        User retrievedUser = userRepository.findById(id).get();
        return retrievedUser;
    }
}
