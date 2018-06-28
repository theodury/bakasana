package fr.etudiantsdefrance.bakasana.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.etudiantsdefrance.bakasana.bdd.model.UserModel;
import fr.etudiantsdefrance.bakasana.exceptions.ExceptionBakasana;
import fr.etudiantsdefrance.bakasana.repository.UserRepository;


@Service
public class UserServices {

	@Autowired
	private UserRepository userRepository;
	
    Logger logger = LoggerFactory.getLogger(UserRepository.class);

	public void createUser(UserModel user) throws ExceptionBakasana {
		try {
			userRepository.save(user);
		}
		catch(Exception e) {
		    logger.error("ERROR ++ Listdvmmatch ++ MatchServices ++ rechercheDonneur- " + e.getMessage());
		    throw new ExceptionBakasana(e);
		}
	}


}
