package com.example.superheroesv3.controllers;

import com.example.superheroesv3.model.Superhero;
import com.example.superheroesv3.model.SuperheroInput;
import com.example.superheroesv3.repositories.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.superheroesv3.services.SuperheroService;

import java.util.ArrayList;

@RestController
@RequestMapping("/superhelte")
public class SuperheroController {


    @Autowired
    private SuperheroService superheroService;
    private SuperheroRepository superheroRepository;

    public SuperheroController(SuperheroService superheroService) {
        this.superheroService = superheroService;
    }

    @GetMapping()
    public ArrayList<Superhero> index() {
        return superheroService.getAllSuperheroes();
    }

    @GetMapping("/name/{name}")
    public Superhero getByName(@PathVariable("name") String name) {
        return superheroService.getSuperheroByName(name);
    }
    @GetMapping("/id/{id}")
    public Superhero getSuperheroByID(@PathVariable("id") int id) {
        return superheroService.getSuperheroByID(id);
    }

    @PostMapping(value = "/opret")
    public Superhero createSuperhero(@RequestBody SuperheroInput superheroInput) {
        System.out.println(superheroInput.toString());

        return superheroService.createSuperhero(superheroInput);
    }
    @PostMapping("/ret/{id}")
    public Superhero edit(@PathVariable("id") int id, @RequestBody SuperheroInput superheroInput) {
        return superheroService.editSuperhero(id, superheroInput);
    }

    @PostMapping("/slet/{id}")
    public Superhero delete(@PathVariable("id") int id, @RequestBody SuperheroInput superheroInput) {
        return superheroService.deleteSuperhero(id, superheroInput);
    }
}
