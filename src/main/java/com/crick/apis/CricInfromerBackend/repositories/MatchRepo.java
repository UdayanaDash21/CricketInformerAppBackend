package com.crick.apis.CricInfromerBackend.repositories;

import com.crick.apis.CricInfromerBackend.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {
    // If you want to Fetch Match details from here you have to provide teamHeading
    Optional<Match> findByTeamHeading(String teamHeading);
}
