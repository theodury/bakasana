package fr.etudiantsdefrance.bakasana.bdd.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class UserModel implements Serializable {
	
	@Id
	@Column(name="first_name")
	private String firstName;

	@Column(name="lastName")
	private String last_name;

	@Column(name="email")
	private String email;
	
	
}
