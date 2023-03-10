package com.example.superheroesv3.controllers;

import com.example.superheroesv3.model.Superhero;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.superheroesv3.services.SuperheroService;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Controller
@RequestMapping("superhelte")
public class SuperheroController {

    private SuperheroService superheroService;

    public SuperheroController(SuperheroService superheroService){
        this.superheroService = superheroService;
    }

    @GetMapping()
    public ArrayList<Superhero> getAllHeroes(){
        return superheroService.getSuperhero();
    }




}
