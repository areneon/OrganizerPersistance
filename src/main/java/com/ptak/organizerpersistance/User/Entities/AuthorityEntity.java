package com.ptak.organizerpersistance.User.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="authorities")
@AllArgsConstructor
@Getter
@Setter
public class AuthorityEntity {
    @Id
    private Long id;

    private String authority;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="username", nullable = false)
    private UserEntity userEntity;

    public AuthorityEntity() {
    }
}
