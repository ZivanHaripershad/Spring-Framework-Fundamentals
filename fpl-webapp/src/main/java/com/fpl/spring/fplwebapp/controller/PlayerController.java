package com.fpl.spring.fplwebapp.controller;

import com.fpl.spring.fplwebapp.service.PlayerService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerService playerService;

    @GetMapping("/players")
    public String getPlayers(Model model){
        model.addAttribute("players", playerService.findAll());

        return "players";
    }
}
