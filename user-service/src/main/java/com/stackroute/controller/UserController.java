package com.stackroute.controller;

import com.stackroute.domain.User;
import com.stackroute.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//Creates RESTful web services
//Maps the request data to the request handler method
//Converts the response body into json or xml response.
@RequestMapping("api/v1/")
//Used to map web request into specific classes or methods.
public class UserController {
    private UserService userService;
    @Autowired
    //Used to inject the dependency automatically.
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("user")
    //Used to map the request and requestmethod into specific method.
    public ResponseEntity<?> saveUser(@RequestBody User user){
        //@RequestBody --> Used to convert the request body into the domain object.
        //Returns the User object as the response for the given request.
        User savedUser = userService.saveUser(user);

        return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("user/{id}")
    //Used to map the request(root path) and requestmethod into specific method.
    public ResponseEntity<?> getUserById(@PathVariable int id){
        //Used to extract the data from query parameter.
        //Returns the User object as the response for the given request.
        User retrievedUser = userService.getUser(id);
        return new ResponseEntity<User>(retrievedUser, HttpStatus.OK);
    }

}
