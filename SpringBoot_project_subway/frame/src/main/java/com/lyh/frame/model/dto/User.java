package com.lyh.frame.model.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

// 유저 엔티티
@Getter
@Setter
@Entity
public class User {
    @Id
    private String userID;
    private String password;
    private String nickname;

    private String userImgPath;
}
