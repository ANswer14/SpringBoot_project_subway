package com.lyh.frame.repository;

import com.lyh.frame.model.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
