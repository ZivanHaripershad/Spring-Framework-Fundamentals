package com.fpl.spring.fplwebapp.repository;

import com.fpl.spring.fplwebapp.entity.Player;

import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {
}
