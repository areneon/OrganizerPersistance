package com.ptak.organizerpersistance.User.Entities;

import com.ptak.organizerpersistance.User.DTO.UserDTO;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Entity
@Table(name="users")
public class UserEntity {
    @Id
    private String username;

    private String password;

    private boolean enabled;

    @OneToMany(mappedBy = "userEntity", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    private Set<AuthorityEntity> authorities;

    public UserEntity() {
    }

    public UserEntity(String username, String password, boolean enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        enabled = enabled;
    }

    public UserDTO toDTO(){
        return new UserDTO(this.username, this.password,this.enabled, this.authorities.stream().map(a -> a.getAuthority()).collect(Collectors.toList()));
    }
}
