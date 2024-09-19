package com.lyh.frame.repository;

import com.lyh.frame.model.dto.FavoriteList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteListRepository extends JpaRepository<FavoriteList, Long> {
}
