package DTO;

public class SuperheroNameCityDTO {

    //Specific attributes that represent the desired data to be transferred
    private String heroName;
    private String city;

    //Constructor that accepts the desired attributes and creates a new instance of the DTO class
    public SuperheroNameCityDTO(String heroName, String city) {
        this.heroName = heroName;
        this.city = city;
    }

    //Getter and setter that allows the attributes to be accessed and updated
    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
