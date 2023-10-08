package com.davi.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davi.shop.entities.user.User;

import java.util.Optional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsernameOrEmail(String usernameOrEmail, String usernameOrEmail1);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
    
    Optional<User> findByEmail(String email);
}
