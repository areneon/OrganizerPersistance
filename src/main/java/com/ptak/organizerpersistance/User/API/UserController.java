package com.ptak.organizerpersistance.User.API;

import com.ptak.organizerpersistance.User.DTO.UserDTO;
import com.ptak.organizerpersistance.User.Services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("user")
@RestController
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public UserDTO getUser(@PathVariable("username")String  username){
        return userService.getUserByUsername(username);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }
}
