package com.jwtAuth.jwtAuth.repository;

import com.jwtAuth.jwtAuth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepo extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
