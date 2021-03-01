package com.visit.saltus.controller;

import com.visit.saltus.model.Locations;
import com.visit.saltus.repo.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class LocationsController
{
    @Autowired
    LocationsRepository repository;

    @RequestMapping(value = "/getlocationsbycategoryid/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Locations> getLocations(@PathVariable long id)
    {
        return repository.findAllByCategoryId(id);
    }

}
