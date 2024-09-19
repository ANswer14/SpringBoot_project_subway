package com.lyh.frame.model.dto;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// 유저 엔티티
@Getter
@Setter
@Entity
@Table(name="USER")
public class User implements UserDetails {
    @Id
    @Column(length = 15)
    private String userId;
    @Column(nullable = false)
    private String password;
    @Column(length = 10, nullable = false)
    private String nickname;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String userImgPath;
    @Column(length = 50, nullable = false)
    private String userEmail;
    @ElementCollection
    @CollectionTable(name = "user_role",
            joinColumns = @JoinColumn(name = "userId", nullable = false)
    )
    @Column(length = 5)
    private Set<String> userRole;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return userRole.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userId;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
