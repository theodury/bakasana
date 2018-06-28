package fr.etudiantsdefrance.bakasana.ressources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.etudiantsdefrance.bakasana.bdd.model.UserModel;
import fr.etudiantsdefrance.bakasana.exceptions.ExceptionBakasana;
import fr.etudiantsdefrance.bakasana.services.UserServices;

@RestController
@RequestMapping("/user")
public class UserRessource {
		
    @Autowired	
    private UserServices matchServices;
    
	@CrossOrigin
    @PostMapping(value="/create")
    @ResponseBody
    public ResponseEntity<?> createUser(@RequestBody final UserModel matchparam) {
		ResponseEntity<?> out;
		try {
			matchServices.createUser(matchparam);
			out =  new ResponseEntity<>(null, HttpStatus.OK);
		} catch (ExceptionBakasana e) {
		    out = new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return out;
    }
	
	@GetMapping(value = "/name")
	public String findByName() {
		return "{name:theo}";
	}
}
