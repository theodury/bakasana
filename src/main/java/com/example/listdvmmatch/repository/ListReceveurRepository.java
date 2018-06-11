package com.example.listdvmmatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.example.listdvmmatch.bdd.model.ListReceveurModel;

public interface ListReceveurRepository extends JpaRepository<ListReceveurModel, Integer>{
	List<ListReceveurModel> findAllByGreffeur(String greffeur);
	}
