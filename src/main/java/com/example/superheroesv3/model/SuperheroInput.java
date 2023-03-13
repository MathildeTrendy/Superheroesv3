package com.example.superheroesv3.model;

public class SuperheroInput {
    private final String heroName;
    private final String realName;
    private final int creationYear;
    private final String superpower;
    private final int human;
    private final double strength;

    public String getHeroName() {
        return heroName;
    }

    public String getRealName() {
        return realName;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public String getSuperpower() {
        return superpower;
    }

    public int getHuman() {
        return human;
    }

    public double getStrength() {
        return strength;
    }

    public SuperheroInput(String heroName, String realName, int creationYear, String superpower, int human, double strength) {
        this.heroName = heroName;
        this.realName = realName;
        this.creationYear = creationYear;
        this.superpower = superpower;
        this.human = human;
        this.strength = strength;
    }
}
