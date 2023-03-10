package com.betaplan.eva.savetravels.repositories;

import com.betaplan.eva.savetravels.models.Travel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravelRepository extends CrudRepository<Travel,Long> {
    List<Travel> findAll();

}
