package com.lyh.frame.repository;

import com.lyh.frame.model.dto.SubwayStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubwayStationRepository extends JpaRepository<SubwayStation, Long> {


    List<SubwayStation> findByStationNameContainingIgnoreCase(String search);


}
