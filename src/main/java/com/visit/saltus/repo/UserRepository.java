package com.visit.saltus.repo;


import com.visit.saltus.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long>
{

    @Query("SELECT t FROM User t"
            + " where UPPER(t.phone) = UPPER(:phone) "
            + " and t.password = :password "
    )
    User findUserByPhone(@Param("phone") String phone, @Param("password") String password);

    @Query("SELECT t FROM User t"
            + " where UPPER(t.phone) = UPPER(:phone) "
    )
    User findUserByPhoneOnly(@Param("phone") String phone);


    @Query("SELECT t FROM User t"
            + " where t.id = :id "
    )
    User findUserById(@Param("id") long id);

}

