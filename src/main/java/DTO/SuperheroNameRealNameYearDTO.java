package DTO;

public class SuperheroNameRealNameYearDTO {

    //Specific attributes that represent the desired data to be transferred
    private String heroName;
    private String realName;
    private int creationYear;

    //Constructor that accepts the desired attributes and creates a new instance of the DTO class
    public SuperheroNameRealNameYearDTO(String heroName, String realName, int creationYear) {
        this.heroName = heroName;
        this.realName = realName;
        this.creationYear = creationYear;
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

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;


    }
}
