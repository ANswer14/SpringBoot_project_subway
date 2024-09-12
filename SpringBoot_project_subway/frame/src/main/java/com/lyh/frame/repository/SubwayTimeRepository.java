package com.lyh.frame.repository;

import com.lyh.frame.model.dto.SubwayTime;
import com.lyh.frame.model.dto.SubwayType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubwayTimeRepository extends JpaRepository<SubwayTime, SubwayType> {
}
