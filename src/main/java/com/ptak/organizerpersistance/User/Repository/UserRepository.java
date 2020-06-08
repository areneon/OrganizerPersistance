package com.ptak.organizerpersistance.User.Repository;

import com.ptak.organizerpersistance.User.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
    @Override
    @Query("select distinct u from UserEntity u join fetch u.authorities")
     List<UserEntity> findAll();

    @Override
    @Query("select distinct u from UserEntity u  join fetch u.authorities where u.username= :username")
    Optional<UserEntity> findById(@Param("username")String username);


}
