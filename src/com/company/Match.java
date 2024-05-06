package com.company;

public class Match {
    private String date;
    private String stadium;
    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;

    public Match(String date, String stadium, Team homeTeam, Team awayTeam, int homeScore, int awayScore) {
        this.date = date;
        this.stadium = stadium;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }



    public void displayInfo(){
        System.out.println("Date: " + date);
        System.out.println("Stadium: " + stadium);
        System.out.println("Home Team: " + homeTeam.getName());
        System.out.println("Away Team: " + awayTeam.getName());
        System.out.println("Home Score: " + homeScore);
        System.out.println("Away Score: " + awayScore);
    }

}
