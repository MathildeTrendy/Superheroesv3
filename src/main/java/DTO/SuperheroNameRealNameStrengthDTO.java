package DTO;

public class SuperheroNameRealNameStrengthDTO {

    //Specific attributes that represent the desired data to be transferred
    private String heroName;
    private String realName;
    private int strength;


    //Constructor that accepts the desired attributes and creates a new instance of the DTO class
    public SuperheroNameRealNameStrengthDTO(String heroName, String realName, int strength) {
        this.heroName = heroName;
        this.realName = realName;
        this.strength = strength;
    }

    //Getter and setter that allows the attributes to be accessed and updated
    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getStrength() {
        return strength;
    }

    public void setSuperPower(int strength) {
        this.strength = strength;
    }






}

