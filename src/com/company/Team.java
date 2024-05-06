package com.company;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private String location;
    private String coach;
    private List<Player> playerList;

    public Team(String name, String location, String coach) {
        this.name = name;
        this.location = location;
        this.coach = coach;
        this.playerList = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public void addPlayer(Player player){
        playerList.add(player);
    }

    public void updatePlayer(String id, String newFullName, String newNational, String newDateOfBirth, double newHeight, double newWeight, String newPosition){
        for(Player player : playerList){
            if(player.getId().equals(id)){
                player.setFullName(newFullName);
                player.setNational(newNational);
                player.setDateOfBirth(newDateOfBirth);
                player.setHeight(newHeight);
                player.setWeight(newWeight);
                player.setPosition(newPosition);
                break;
            }
        }
    }

    public void removePlayer(String playerId) {
        // Iterate through the playerList to find the player with the given playerId
        for (Player player : playerList) {
            if (player.getId().equals(playerId)) {
                playerList.remove(player); // Remove the player from the list
                System.out.println("Player with ID " + playerId + " has been removed from the team.");
                return; // Exit the method after removing the player
            }
        }
        // If the player with the given ID is not found
        System.out.println("Player with ID " + playerId + " is not in the team.");
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Coach: " + coach);
    }

    public void displayPlayer(){
        for(Player player : playerList){
            player.displayInfo();
            System.out.println();
        }
    }

}
