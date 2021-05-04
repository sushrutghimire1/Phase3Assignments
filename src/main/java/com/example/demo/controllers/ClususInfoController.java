package com.example.demo.controllers;

import com.example.demo.models.ClususInfo;
import com.example.demo.repositories.ClususInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/clususInfo")
public class ClususInfoController {

    private final ClususInfoRepository clususInfoRepository;

    @Autowired
    public ClususInfoController(ClususInfoRepository clususInfoRepository) {
        this.clususInfoRepository = clususInfoRepository;
    }

    @GetMapping
    @RequestMapping("{id}")
    public ClususInfo get(@PathVariable int id) {
        return clususInfoRepository.getOne(id);
    }

    @PostMapping
    @RequestMapping("{id}")
    public ClususInfo create(@RequestBody final ClususInfo clususInfo) {
        return clususInfoRepository.saveAndFlush(clususInfo);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void create(@PathVariable int id) {
        clususInfoRepository.deleteById(id);
    }
}
