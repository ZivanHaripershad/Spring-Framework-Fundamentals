package com.fpl.spring.fplwebapp.service;

import com.fpl.spring.fplwebapp.entity.Player;

public interface PlayerService {
    Iterable<Player> findAll();
}
