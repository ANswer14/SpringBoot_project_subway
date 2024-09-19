package com.lyh.frame.model.dto;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginForm {

    @Id
    @NotEmpty(message = "아이디를 적어주세요.")
    @Size(max = 15, min = 3)
    private String userId;

    @NotEmpty(message = "비밀번호를 적어주세요.")
    @Size(max = 20, min = 3)
    private String password;



}
