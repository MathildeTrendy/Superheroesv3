package com.example.superheroesv3.repositories;
import com.example.superheroesv3.model.Superhero;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;

@Repository
public class SuperheroRepository {

    public ArrayList<Superhero> getAllSuperheroes(){
        ArrayList<Superhero>listOfHeroes = new ArrayList();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superhero", "root", "Mathmilo1996")) {
            System.out.println("test2");
            String SQL= "SELECT * FROM superhero;";

            System.out.println("test1");

            Statement stmt = con.createStatement();

            System.out.println("test3");
            ResultSet rst = stmt.executeQuery(SQL);
            System.out.println("Forbundet til Database");
            while(rst.next()) {
                int heroId = rst.getInt("superhero_id");
                String heroName = rst.getString("hero_name");
                String realName = rst.getString("real_name");
                int creationYear = rst.getInt("creation_year");
                String superPower = rst.getString("superpower");
                int human = rst.getInt("is_human");
                double strength = rst.getDouble("strength");

                System.out.println(heroId + heroName+realName+creationYear+superPower+human+strength);

                Superhero createdSuperhero = new Superhero(heroId,heroName,realName,creationYear,superPower,human,strength);
                System.out.println("test10");
                listOfHeroes.add(createdSuperhero);
            }
        } catch (SQLException e) {
            System.out.println("test6");
            throw new RuntimeException(e);
        }

        System.out.println("test5");

    return listOfHeroes;
    }

/*
    Superhero superhero1 = new Superhero(1,"Bruce Wayne", "Batman", 1998, "Rig", true, 2.1);
    Superhero superhero2 = new Superhero(44,"Clark Kent", "Superman", 1975, "Flyve", true, 3.8);
    Superhero superhero3 = new Superhero(32,"Low Fat", "Lone Svinkløv", 1944, "Spise uden at tage på", true,  0);
    Superhero superhero4 = new Superhero(98,"Prinsesse Diana", "Wonder Woman", 1941, "Flyve", true, 3.1);
    Superhero superhero5 = new Superhero(2,"Peter Parker", "Spiderman", 1938, "Spinne", true, 2.1);


    private ArrayList<Superhero> superheroesDB = new ArrayList<>(Arrays.asList(superhero1,superhero2,superhero3,superhero4,superhero5));
*/
/*
    // Getter for arraylist of superheroes
    public ArrayList<Superhero> getAllSuperHeroes() {
        return superheroesDB;
    }

    public void createSuperhero(int heroId, String heroName, String realName, int creationYear, String superpower, boolean human, double strength) {

        Superhero hero = new Superhero(heroId, heroName, realName, creationYear, superpower, human, strength);
        superheroesDB.add(hero);
    }

    public ArrayList<Superhero> searchFor(String searchTerm) {
        ArrayList<Superhero> searchResult = new ArrayList<>();

        for (Superhero superhero : superheroesDB) {
            if (superhero.getHeroName().equalsIgnoreCase(searchTerm)) {
                searchResult.add(superhero);
            }
        }
        return searchResult;
    }

    public boolean deleteSuperhero(Superhero superhero) {
        boolean succes;
        succes = superheroesDB.remove(superhero);
        return succes;
    }

    public void updateSuperheroList(ArrayList<Superhero> superheroes) {
        superheroesDB = superheroes;
    }

    public ArrayList<Superhero> SortedList() {

        return null;
    }
*/
}

