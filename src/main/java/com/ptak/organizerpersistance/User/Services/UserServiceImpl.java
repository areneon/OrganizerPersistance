package com.ptak.organizerpersistance.User.Services;

import com.ptak.organizerpersistance.User.DTO.UserDTO;
import com.ptak.organizerpersistance.User.Repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream().map(u -> u.toDTO()).collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserByUsername(String username) {
        return userRepository.findById(username).get().toDTO();
    }
}
