package com.crick.apis.CricInfromerBackend.services;

import com.crick.apis.CricInfromerBackend.entities.Match;

import java.util.List;

public interface MatchService {

    //get all matches

    List<Match> getAllMatches();

    //get live matches

    List<Match> getLiveMatches();

    //get cwc2023 point table

    List<List<String>> getPointTable();


    List<Match> getLiveMatchScores();

    void updateMatch(Match match1);

    List<List<String>> getCWC2023PointTable();
}
