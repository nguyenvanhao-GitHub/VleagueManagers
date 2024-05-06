package com.company;

import java.util.ArrayList;
import java.util.List;

public class VleagueManager {
    private List<Team> teamList;
    private List<Match> matchList;

    public VleagueManager() {
        this.teamList = new ArrayList<Team>();
        this.matchList = new ArrayList<Match>();
    }

    // Method to add team
    public void addTeam(Team team) {
        teamList.add(team);
    }

    // Method to remove team
    public void removeTeam(Team team) {
        teamList.remove(team);
    }

    // Method to update team information
    public void updateTeamInfo(Team team, String location, String coach) {
        team.setLocation(location);
        team.setCoach(coach);

        for (Team t : teamList) {
            if (t.equals(team)) {
                t.setLocation(location);
                t.setCoach(coach);
                break;
            }
        }
    }

    public void addMatch(Match match){
        matchList.add(match);
    }

    public void listMatchResults(String date) {
        System.out.println("Matches on " + date + ":");
        for (Match match : matchList) {
            if (match.getDate().equals(date)) {
                match.displayInfo();
                System.out.println();
            }
        }
    }

    // Method to calculate points for teams at a point of time
    public void calculatePoints () {
        for (Team team : teamList) {
            int points = 0;
            for (Match match : matchList) {
                if (match.getHomeTeam().equals(team)) {
                    if (match.getHomeScore() > match.getAwayScore()) {
                        points += 3; // Win
                    } else if (match.getHomeScore() == match.getAwayScore()) {
                        points += 1; // Draw
                    }
                } else if (match.getAwayTeam().equals(team)) {
                    if (match.getAwayScore() > match.getHomeScore()) {
                        points += 3; // Win
                    } else if (match.getAwayScore() == match.getHomeScore()) {
                        points += 1; // Draw
                    }
                }
            }
            System.out.println("Team: " + team.getName() + ", Points: " + points);
        }
    }

    public void listPlayerByBirthYear(int year){
        for (Team team : teamList){
            for (Player player : team.getPlayerList()){
                if(player.getDateOfBirth().startsWith(Integer.toString(year))){
                    player.displayInfo();
                }
            }
        }
    }

    public Player findTallestPlayer() {
        Player tallestPlayer = null;
        double maxHeight = Double.MIN_VALUE;

        for (Team team : teamList) {
            for (Player player : team.getPlayerList()) {
                if (player.getHeight() > maxHeight) {
                    tallestPlayer = player;
                    maxHeight = player.getHeight();
                }
            }
        }
        return tallestPlayer;
    }

    public Player findShortestPlayer() {
        Player shortestPlayer = null;
        double minHeight = Double.MAX_VALUE;

        for (Team team : teamList) {
            for (Player player : team.getPlayerList()) {
                if (player.getHeight() < minHeight) {
                    shortestPlayer = player;
                    minHeight = player.getHeight();
                }
            }
        }
        return shortestPlayer;
    }

    public void displayAllTeams () {
        System.out.println("All Teams:");
        for (Team team : teamList) {
            team.displayInfo();
            System.out.println();
        }
    }

    public void displayAllMatches() {
        System.out.println("All Matches:");
        for (Match match : matchList) {
            match.displayInfo();
            System.out.println();
        }
    }
}
