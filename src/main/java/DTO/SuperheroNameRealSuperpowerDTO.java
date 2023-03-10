package DTO;

public class SuperheroNameRealSuperpowerDTO {

    //Specific attributes that represent the desired data to be transferred
    private String heroName;
    private String realName;
    private String superPower;

    //Constructor that accepts the desired attributes and creates a new instance of the DTO class
    public SuperheroNameRealSuperpowerDTO(String heroName, String realName, String superPower) {
        this.heroName = heroName;
        this.realName = realName;
        this.superPower = superPower;
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

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }
}
