package com.lyh.frame.repository;

import com.lyh.frame.model.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    // id로 계정 찾기
    Optional<User> findByUserId(String userId);
    // 유저 닉네임으로 계정 찾기
    Optional<User> findByNickname(String nickname);
}
