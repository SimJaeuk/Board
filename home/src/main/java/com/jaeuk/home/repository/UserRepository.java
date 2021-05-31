package com.jaeuk.home.repository;

import com.jaeuk.home.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
