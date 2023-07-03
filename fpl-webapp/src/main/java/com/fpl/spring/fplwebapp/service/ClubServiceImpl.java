package com.fpl.spring.fplwebapp.service;

import com.fpl.spring.fplwebapp.entity.Club;
import com.fpl.spring.fplwebapp.repository.ClubRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClubServiceImpl implements ClubService{

    private ClubRepository clubRepository;

    @Override
    public Iterable<Club> findAll() {
        return clubRepository.findAll();
    }

    @Override
    public void addClub(final Club club) {
        clubRepository.save(club);
    }
}
