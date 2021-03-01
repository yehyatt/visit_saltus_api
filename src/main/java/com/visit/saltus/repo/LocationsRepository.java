package com.visit.saltus.repo;

import com.visit.saltus.model.Locations;
import com.visit.saltus.model.Locations;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LocationsRepository extends CrudRepository<Locations, Long>
{

    @Query("SELECT t FROM Locations t"
            + " where t.categoryid = :CategoryId"
            + " order by t.id desc"
    )
    List<Locations> findAllByCategoryId(long CategoryId);

}