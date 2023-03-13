package com.example.superheroesv3.services;
import com.example.superheroesv3.model.Superhero;
import com.example.superheroesv3.model.SuperheroInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.superheroesv3.repositories.SuperheroRepository;
import java.util.ArrayList;

@Service
public class SuperheroService {

    @Autowired
    private SuperheroRepository superheltRepository;

    public SuperheroService(SuperheroRepository superheltRepository) {
        this.superheltRepository = superheltRepository;
    }

    public ArrayList<Superhero> getAllSuperheroes() {
        return superheltRepository.getAllSuperheroes();
    }

    public Superhero getSuperheroByName(String name) {
        return superheltRepository.getSuperheroBy("hero_name", name);
    }

    public Superhero getSuperheroByID(int id) {
        return superheltRepository.getSuperheroBy("superhero_id", Integer.toString(id));
    }

    public Superhero createSuperhero(SuperheroInput superheroInput) {
        int id = superheltRepository.createSuperhero(superheroInput);

        return this.getSuperheroByID(id);
    }

    public Superhero editSuperhero(int id, SuperheroInput superheroInput) {
        int updateCount = superheltRepository.editSuperhero(id, superheroInput);
        System.out.println(updateCount);
        return this.getSuperheroByID(id);
    }

    public Superhero deleteSuperhero(int id, SuperheroInput superheroInput) {
        int deleteCount = superheltRepository.deleteSuperhero(id, superheroInput);
        System.out.println(deleteCount);
        return this.getSuperheroByID(id);
    }

}