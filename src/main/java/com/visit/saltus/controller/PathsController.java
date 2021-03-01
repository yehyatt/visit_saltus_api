package com.visit.saltus.controller;

import com.visit.saltus.model.Locations;
import com.visit.saltus.model.Paths;
import com.visit.saltus.repo.LocationsRepository;
import com.visit.saltus.repo.PathsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class PathsController
{
    @Autowired
    PathsRepository repository;

    @RequestMapping(value = "/getpaths", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Paths> getPaths()
    {
        return repository.findAllPaths();
    }

}
