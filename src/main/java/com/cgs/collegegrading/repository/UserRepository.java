package com.cgs.collegegrading.repository;

import com.cgs.collegegrading.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    UserModel findUserByUsername(String userName);
}
