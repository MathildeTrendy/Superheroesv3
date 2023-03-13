package com.example.superheroesv3.repositories;

import com.example.superheroesv3.model.Superhero;
import com.example.superheroesv3.model.SuperheroInput;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;

@Repository
public class SuperheroRepository {

    public ArrayList<Superhero> getAllSuperheroes() {
        ArrayList<Superhero> listOfHeroes = new ArrayList();
        try (
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superhero", "root", "Mathmilo1996")
        ) {
            String SQL = "SELECT * FROM superhero;";
            Statement stmt = con.createStatement();

            ResultSet rst = stmt.executeQuery(SQL);
            System.out.println("Forbundet til Database");
            while (rst.next()) {
                int heroId = rst.getInt("superhero_id");
                String heroName = rst.getString("hero_name");
                String realName = rst.getString("real_name");
                int creationYear = rst.getInt("creation_year");
                String superPower = rst.getString("superpower");
                int human = rst.getInt("is_human");
                double strength = rst.getDouble("strength");

                System.out.println(heroId + heroName + realName + creationYear + superPower + human + strength);

                Superhero createdSuperhero = new Superhero(heroId, heroName, realName, creationYear, superPower, human, strength);
                listOfHeroes.add(createdSuperhero);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listOfHeroes;
    }


    public Superhero getSuperheroBy(String field, String value) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superhero", "root", "Mathmilo1996")
        ) {
            String SQL = "SELECT * FROM superhero WHERE " + field + " = \"" + value + "\";";
            Statement stmt = con.createStatement();

            ResultSet rst = stmt.executeQuery(SQL);
            System.out.println("Forbundet til Database");
            if (rst.next()) {
                int heroId = rst.getInt("superhero_id");
                String heroName = rst.getString("hero_name");
                String realName = rst.getString("real_name");
                int creationYear = rst.getInt("creation_year");
                String superPower = rst.getString("superpower");
                int human = rst.getInt("is_human");
                double strength = rst.getDouble("strength");

                System.out.println(heroId + heroName + realName + creationYear + superPower + human + strength);

                return new Superhero(heroId, heroName, realName, creationYear, superPower, human, strength);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public int createSuperhero(SuperheroInput superheroInput) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superhero", "root", "Mathmilo1996")
        ) {
            String SQL = "INSERT INTO superhero " +
                    "(hero_name, real_name, superpower, creation_year, is_human, strength)" +
                    "VALUES (\""+
                    superheroInput.getHeroName()+"\",\""+
                    superheroInput.getRealName()+"\",\""+
                    superheroInput.getSuperpower()+"\",\""+
                    superheroInput.getCreationYear()+"\",\""+
                    superheroInput.getHuman()+"\",\""+
                    superheroInput.getStrength()+
                    "\")";

            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();

            int generatedKey = 0;

            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }

            return generatedKey;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int editSuperhero(int id, SuperheroInput superheroInput) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superhero", "root", "Mathmilo1996")
        ) {
            String SQL = "UPDATE superhero SET" +
                    " hero_name = \""+ superheroInput.getHeroName()
                    +"\", real_name = \""+ superheroInput.getRealName()
                    +"\", superpower = \""+ superheroInput.getSuperpower()
                    +"\", creation_year = \""+ superheroInput.getCreationYear()
                    +"\", is_human = \""+ superheroInput.getHuman()
                    +"\", strength = \""+ superheroInput.getStrength()+
                    "\" WHERE superhero_id = \""+ id +"\"";

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.execute();

            return ps.getUpdateCount();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int deleteSuperhero(int id, SuperheroInput superheroInput) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superhero", "root", "Mathmilo1996")
        ) {
            String SQL = "DELETE FROM superhero" +
                    " hero_name = \""+ superheroInput.getHeroName()
                    +"\", real_name = \""+ superheroInput.getRealName()
                    +"\", superpower = \""+ superheroInput.getSuperpower()
                    +"\", creation_year = \""+ superheroInput.getCreationYear()
                    +"\", is_human = \""+ superheroInput.getHuman()
                    +"\", strength = \""+ superheroInput.getStrength()+
                    "\" WHERE superhero_id = \""+ id +"\"";

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.execute();

            return ps.getUpdateCount();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }











    //make insertQuery
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

