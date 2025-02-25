package com.andymartinez1.notes.repository;

import com.andymartinez1.notes.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String username);

    Boolean existsByEmail(String email);

    boolean existsByUserName(String username);
}
