package com.ptak.organizerpersistance.User.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {

    private String username;

    private String password;

    private boolean isEnabled;

    private List<String> roles;

}
