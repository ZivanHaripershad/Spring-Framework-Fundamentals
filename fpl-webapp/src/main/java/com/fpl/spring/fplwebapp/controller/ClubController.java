package com.fpl.spring.fplwebapp.controller;

import com.fpl.spring.fplwebapp.entity.Club;
import com.fpl.spring.fplwebapp.service.ClubService;
import com.fpl.spring.fplwebapp.service.PlayerService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ClubController {

    private final ClubService clubService;

    @GetMapping("/clubs")
    public String getClubs(Model model){
        model.addAttribute("clubs", clubService.findAll());

        return "clubs";
    }

    @PostMapping("/club/add")
    public void addClub(Club club){
        clubService.addClub(club);
    }
}
