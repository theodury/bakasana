package com.example.listdvmmatch.repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.listdvmmatch.bdd.model.MatchModel;


public interface MatchRepository extends CrudRepository<MatchModel, Integer> {

    @Procedure(name = "rechercherdvm")

    void rechercherdvm(@Param("orig") String orig, 
    		           @Param("pp_id") String pp_id);

}