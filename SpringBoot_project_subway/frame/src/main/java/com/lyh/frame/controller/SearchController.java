package com.lyh.frame.controller;

import com.lyh.frame.model.dto.SubwayStation;
import com.lyh.frame.repository.SubwayStationRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SearchController {

    @GetMapping("/goSearch")
    public String search(Model model) {
        return "menu/search";
    }

    private final SubwayStationRepository subwayStationRepository;

    public SearchController(SubwayStationRepository subwayStationRepository) {
        this.subwayStationRepository = subwayStationRepository;
    }

    @CrossOrigin(origins = "http://localshot:8081")
    @ResponseBody
    @GetMapping("/goSearch/stations")
    public List<SubwayStation> getSubwayStations(String search) {
        return subwayStationRepository.findByStationNameContainingIgnoreCase(search);
    }
}
