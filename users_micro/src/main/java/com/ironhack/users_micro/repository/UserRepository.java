package com.ironhack.users_micro.repository;

import com.ironhack.users_micro.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
