package com.company;

public class Player {
    private String id;
    private String fullName;
    private String national;
    private String dateOfBirth;
    private double height;
    private double weight;
    private String position;

    public Player(String id, String fullName, String national, String dateOfBirth, double height, double weight, String position) {
        this.id = id;
        this.fullName = fullName;
        this.national = national;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void displayInfo() {
        System.out.println("Id: " + id);
        System.out.println("FullName: " + fullName);
        System.out.println("National: " + national);
        System.out.println("DateOfBirth: " + dateOfBirth);
        System.out.printf("Height: %.2f%n", height);
        System.out.println("Weight: " + weight);
        System.out.println("Position: " + position);
    }
}
