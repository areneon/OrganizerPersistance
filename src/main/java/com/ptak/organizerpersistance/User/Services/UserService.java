package com.ptak.organizerpersistance.User.Services;

import com.ptak.organizerpersistance.User.DTO.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> getAllUsers();

    UserDTO getUserByUsername(String username);

}
