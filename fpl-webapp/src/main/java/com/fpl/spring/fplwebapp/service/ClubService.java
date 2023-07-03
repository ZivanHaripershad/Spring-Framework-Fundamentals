package com.fpl.spring.fplwebapp.service;

import com.fpl.spring.fplwebapp.entity.Club;

public interface ClubService {

    Iterable<Club> findAll();
    void addClub(Club club);
}
