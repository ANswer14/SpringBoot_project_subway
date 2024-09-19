package com.lyh.frame.model.dao;

import com.lyh.frame.model.dto.User;
import com.lyh.frame.model.dto.UserRegisterForm;
import com.lyh.frame.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class UserDAO {

    private final UserRepository USERREPOSITORY;
    private final BCryptPasswordEncoder passwordEncoder;


    public void register(UserRegisterForm user, String imagePath) {
        Set<String> set = new HashSet<>();
        set.add("user");
        // 엔티티 객체
        User registerUser = new User();
        registerUser.setUserId(user.getUserId());
        registerUser.setUserEmail(user.getUserEmail());
        registerUser.setUserRole(set);
        registerUser.setPassword(passwordEncoder.encode(user.getPassword()));
        registerUser.setUserImgPath(imagePath);
        registerUser.setNickname(user.getNickname());
        USERREPOSITORY.save(registerUser);
    }





}
