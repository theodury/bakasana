package com.example.listdvmmatch.bdd.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="liste_receveurs_actif")

public class ListReceveurModel {
	
	@Id
	@Column(name="p_id", unique = true)
	private String idPatient;

	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;

	@Column(name="date_nais")
	private Date date_nais;

	@Column(name="greffeur")
	private String greffeur;
	
	@Column(name="p_dna_a1")
	private String p_dna_a1;
	
	@Column(name="p_dna_a2")
	private String p_dna_a2;
	
	@Column(name="p_dna_b1")
	private String p_dna_b1;
	
	@Column(name="p_dna_b2")
	private String p_dna_b2;
	
	@Column(name="p_dna_c1")
	private String p_dna_c1;
	
	@Column(name="p_dna_c2")
	private String p_dna_c2;
	
	@Column(name="p_drb11")
	private String p_drb11;
	
	@Column(name="p_drb12")
	private String p_drb12;
	
	@Column(name="p_dqb11")
	private String p_dqb11;
	
	@Column(name="p_dqb12")
	private String p_dqb12;

	public ListReceveurModel() {
		super();
	}

	public String getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(String idPatient) {
		this.idPatient = idPatient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDate_nais() {
		return date_nais;
	}

	public void setDate_nais(Date date_nais) {
		this.date_nais = date_nais;
	}

	public String getGreffeur() {
		return greffeur;
	}

	public void setGreffeur(String greffeur) {
		this.greffeur = greffeur;
	}

	public String getP_dna_a1() {
		return p_dna_a1;
	}

	public void setP_dna_a1(String p_dna_a1) {
		this.p_dna_a1 = p_dna_a1;
	}

	public String getP_dna_a2() {
		return p_dna_a2;
	}

	public void setP_dna_a2(String p_dna_a2) {
		this.p_dna_a2 = p_dna_a2;
	}

	public String getP_dna_b1() {
		return p_dna_b1;
	}

	public void setP_dna_b1(String p_dna_b1) {
		this.p_dna_b1 = p_dna_b1;
	}

	public String getP_dna_b2() {
		return p_dna_b2;
	}

	public void setP_dna_b2(String p_dna_b2) {
		this.p_dna_b2 = p_dna_b2;
	}

	public String getP_dna_c1() {
		return p_dna_c1;
	}

	public void setP_dna_c1(String p_dna_c1) {
		this.p_dna_c1 = p_dna_c1;
	}

	public String getP_dna_c2() {
		return p_dna_c2;
	}

	public void setP_dna_c2(String p_dna_c2) {
		this.p_dna_c2 = p_dna_c2;
	}

	public String getP_drb11() {
		return p_drb11;
	}

	public void setP_drb11(String p_drb11) {
		this.p_drb11 = p_drb11;
	}

	public String getP_drb12() {
		return p_drb12;
	}

	public void setP_drb12(String p_drb12) {
		this.p_drb12 = p_drb12;
	}

	public String getP_dqb11() {
		return p_dqb11;
	}

	public void setP_dqb11(String p_dqb11) {
		this.p_dqb11 = p_dqb11;
	}

	public String getP_dqb12() {
		return p_dqb12;
	}

	public void setP_dqb12(String p_dqb12) {
		this.p_dqb12 = p_dqb12;
	}
			
	
} 