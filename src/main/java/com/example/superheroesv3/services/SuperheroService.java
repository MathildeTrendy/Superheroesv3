package com.example.superheroesv3.services;
import com.example.superheroesv3.model.Superhero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.superheroesv3.repositories.SuperheroRepository;
import java.util.ArrayList;

@Service
public class SuperheroService {

    @Autowired
    private SuperheroRepository superheltRepository;

    public SuperheroService(SuperheroRepository superheltRepository){
        this.superheltRepository = superheltRepository;
    }

    public ArrayList<Superhero> getSuperhero(){
        System.out.println("i service");
     return superheltRepository.getAllSuperheroes();
    }



}
