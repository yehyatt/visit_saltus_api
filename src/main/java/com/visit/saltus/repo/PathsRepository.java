package com.visit.saltus.repo;

import com.visit.saltus.model.Locations;
import com.visit.saltus.model.Paths;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PathsRepository extends CrudRepository<Paths, Long>
{

    @Query("SELECT t FROM Paths t"
            + " order by t.id desc"
    )
    List<Paths> findAllPaths();

}