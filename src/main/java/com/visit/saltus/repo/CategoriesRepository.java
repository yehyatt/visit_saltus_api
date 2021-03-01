package com.visit.saltus.repo;

import com.visit.saltus.model.Categories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CategoriesRepository extends CrudRepository<Categories, Long>
{

    @Query("SELECT t FROM Categories t"
            + " order by t.id desc"
    )
    List<Categories> findAll();
}