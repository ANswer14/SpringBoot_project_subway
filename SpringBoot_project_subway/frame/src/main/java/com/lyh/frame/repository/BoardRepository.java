package com.lyh.frame.repository;

import com.lyh.frame.model.dto.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
