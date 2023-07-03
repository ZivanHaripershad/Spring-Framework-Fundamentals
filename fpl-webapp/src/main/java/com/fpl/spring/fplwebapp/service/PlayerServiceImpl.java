package com.fpl.spring.fplwebapp.service;

import com.fpl.spring.fplwebapp.entity.Player;
import com.fpl.spring.fplwebapp.repository.PlayerRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService{

    private final PlayerRepository playerRepository;

    @Override
    public Iterable<Player> findAll() {
        return playerRepository.findAll();
    }
}
