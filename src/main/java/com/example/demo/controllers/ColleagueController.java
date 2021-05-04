package com.example.demo.controllers;

import com.example.demo.models.Colleague;
import com.example.demo.repositories.ColleagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/colleague")
public class ColleagueController {

    private final ColleagueRepository colleagueRepository;

    @Autowired
    public ColleagueController(ColleagueRepository colleagueRepository) {
        this.colleagueRepository = colleagueRepository;
    }

    @GetMapping
    @RequestMapping("{id}")
    public Colleague get(@PathVariable int id) {
        return colleagueRepository.getOne(id);
    }

    @PostMapping
    @RequestMapping("{id}")
    public Colleague create(@RequestBody final Colleague colleague) {
        return colleagueRepository.saveAndFlush(colleague);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void create(@PathVariable int id) {
        colleagueRepository.deleteById(id);
    }
}
