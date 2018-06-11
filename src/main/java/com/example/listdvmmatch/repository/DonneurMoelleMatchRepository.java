package com.example.listdvmmatch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.listdvmmatch.bdd.model.DonneurMoelleMatchModel;

public interface DonneurMoelleMatchRepository extends JpaRepository<DonneurMoelleMatchModel, Integer>{
	
	List<DonneurMoelleMatchModel> findByIdPatient(String idPatient);

	List<DonneurMoelleMatchModel> findAllByIdPatient(String idPatient);

}

