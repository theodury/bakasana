package fr.etudiantsdefrance.bakasana.repository;

import org.springframework.data.repository.CrudRepository;

import fr.etudiantsdefrance.bakasana.bdd.model.UserModel;


public interface UserRepository extends CrudRepository<UserModel, Integer> {
	
}