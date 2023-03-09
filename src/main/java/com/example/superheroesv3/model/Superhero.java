package com.example.superheroesv3.model;

public class Superhero {
    private int heroId;
    private String heroName;
    private String realName;
    private int creationYear;
    private String superpower;
    private int human;
    private double strength;

    // Constructor
    public Superhero(int heroId, String heroName, String realName, int creationYear, String superpower, int human, double strength) {
        this.heroId = heroId;
        this.heroName = heroName;
        this.realName = realName;
        this.creationYear = creationYear;
        this.superpower = superpower;
        this.human = human;
        this.strength = strength;
    }

    public Superhero() {
    }

    // Setter for all the field of attributes
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setHuman(int human) {
        this.human = human;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }
    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    // Getter for all the field of attributes
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

    public double getStrength() {
        return strength;
    }

    public int getHeroId() {
        return heroId;
    }

    public int isHuman() {
        return human;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "heroName='" + heroName + '\'' +
                ", realName='" + realName + '\'' +
                ", creationYear=" + creationYear +
                ", superpower='" + superpower + '\'' +
                ", human=" + human +
                ", strength=" + strength +
                '}';
    }

    //Ternary operator for boolean human
  /*  public String getHumanternary() {
        String getHumanternary  = (human) ? "No" : "Yes";
        return getHumanternary;
    }
*/
}
