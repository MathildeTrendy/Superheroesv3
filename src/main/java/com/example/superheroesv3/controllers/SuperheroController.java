package com.example.superheroesv3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.superheroesv3.services.SuperheroService;

@Controller
@RequestMapping("superhelte")
public class SuperheroController {

    private SuperheroService superheroService;

    public SuperheroController(SuperheroService superheroService){
        this.superheroService = superheroService;
    }

    @GetMapping("/")
    public String getAllHeroes(){
        System.out.println(superheroService.getSuperhero());
     return "welcome";
    }




}
