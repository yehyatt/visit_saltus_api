package com.visit.saltus.controller;

import com.visit.saltus.model.Categories;
import com.visit.saltus.model.Locations;
import com.visit.saltus.repo.CategoriesRepository;
import com.visit.saltus.repo.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CategoriesController
{
    @Autowired
    CategoriesRepository repository;

    @RequestMapping(value = "/getcategories", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Categories> getCategories()
    {
        return repository.findAll();
    }

}
