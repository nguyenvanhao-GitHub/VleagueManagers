package com.company;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("123456", "Player 1", "VetNames", "2004-10-25", 1.70, 60.0, "Striker");
        Player player2 = new Player("789102", "Player 2", "VetNames", "2004-10-25", 1.80, 70.0, "Goalie");

        Team team1 = new Team("Team A", "City A", "Coach A");
        team1.addPlayer(player1);

        Team team2 = new Team("Team B", "City B", "Coach B");
        team2.addPlayer(player2);

        Match match1 = new Match("2024-05-04", "Stadium X", team1, team2, 2, 1);


        // Display player information
        player1.displayInfo();
        System.out.println();
        player2.displayInfo();
        System.out.println();

        // Display team information
        team1.displayInfo();
        System.out.println();
        team2.displayInfo();
        System.out.println();

        // Display list of players in a team
        team1.displayPlayer();
        team2.displayPlayer();

        // Display match information
        match1.displayInfo();
        System.out.println();

        // Update player information
        team1.updatePlayer("123456", "New Player 1", "New VetNames", "2005-10-25", 1.75, 65.0, "Midfielder");
        // After player update
        System.out.println("Player Information after player update:");
        team1.displayPlayer();


        VleagueManager vleagueManager = new VleagueManager();
        vleagueManager.updateTeamInfo(team1, "City C", "Coach C");

        System.out.println("Player Information after team update :");
        vleagueManager.displayAllTeams();
    }
}
