package com.fpl.spring.fplwebapp.bootstrap;

import com.fpl.spring.fplwebapp.entity.Club;
import com.fpl.spring.fplwebapp.entity.League;
import com.fpl.spring.fplwebapp.entity.Player;
import com.fpl.spring.fplwebapp.repository.ClubRepository;
import com.fpl.spring.fplwebapp.repository.LeagueRepository;
import com.fpl.spring.fplwebapp.repository.PlayerRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class BootstrapData implements CommandLineRunner {

    private final PlayerRepository playerRepository;
    private final ClubRepository clubRepository;

    private final LeagueRepository leagueRepository;

    @Override
    public void run(final String... args) throws Exception {
        var alejandroGarnacho = Player.builder()
            .name("Alejandro")
            .surname("Garnacho")
            .number("7")
            .build();

        var mohammedSalah = Player.builder()
            .name("Mohammed")
            .surname("Salah")
            .number("11")
            .build();

        var manchesterUnited = Club.builder()
            .name("Manchester United")
            .stadium("Old Trafford")
            .players(List.of(alejandroGarnacho))
            .build();

        var liverpool = Club.builder()
            .name("Liverpool")
            .stadium("Anfield")
            .players(List.of(mohammedSalah))
            .build();

        var premierLeague = League.builder()
            .name("Premier League")
            .clubs(List.of(manchesterUnited, liverpool))
            .build();

        var savedAlejandroGarnacho = playerRepository.save(alejandroGarnacho);
        var savedMoSalah = playerRepository.save(mohammedSalah);
        var savedManchesterUnited = clubRepository.save(manchesterUnited);
        var savedLiverpool = clubRepository.save(liverpool);

        savedAlejandroGarnacho.setClub(savedManchesterUnited);
        savedMoSalah.setClub(savedLiverpool);

        playerRepository.saveAll(List.of(savedAlejandroGarnacho, savedMoSalah));

        leagueRepository.save(premierLeague);
    }
}
