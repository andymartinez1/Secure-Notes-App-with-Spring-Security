package com.andymartinez1.notes.repository;

import com.andymartinez1.notes.entity.AppRole;
import com.andymartinez1.notes.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}
