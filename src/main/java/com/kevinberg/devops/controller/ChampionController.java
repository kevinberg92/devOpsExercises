package com.kevinberg.devops.controller;


import com.kevinberg.devops.entity.Champion;
import com.kevinberg.devops.repo.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class ChampionController {

    private ChampionRepository championRepository;
    private static final Logger LOG = Logger.getLogger(ChampionController.class.getName());


    //note the constructor param
    @Autowired
    public ChampionController(ChampionRepository championRepository) {
        this.championRepository = championRepository;
    }

    @RequestMapping(path="/ping")
    public String ping() {
        LOG.info(String.format("Ping"));
        return "pong";
    }

    @RequestMapping(path="/pong")
    public String pong() {
        LOG.info(String.format("Pong"));
        return "ping";
    }

    @RequestMapping(path="/champions/{ssn")
    public List<Champion> getChampions(@PathVariable("ssn") String ssn) {
        LOG.info(String.format("Champion list requested for %s", ssn));
        return championRepository.findByName(ssn);
    }



}
