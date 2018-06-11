package com.example.listdvmmatch.bdd.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="list_dvm_match")

public class DonneurMoelleMatchModel {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="p_id")
	private String idPatient;

	@Id
	@Column(name="d_id")
	private String idDonneur;

	@Column(name="type_match")
	private String type_match;
	
	@Column(name="rank")
	private Integer rank;

	@Column(name="d_dna_a1")
	private String d_dna_a1;
	
	@Column(name="d_dna_a2")
	private String d_dna_a2;
	
	@Column(name="d_dna_b1")
	private String d_dna_b1;
	
	@Column(name="d_dna_b2")
	private String d_dna_b2;
	
	@Column(name="d_dna_c1")
	private String d_dna_c1;
	
	@Column(name="d_dna_c2")
	private String d_dna_c2;
	
	@Column(name="d_drb11")
	private String d_drb11;
	
	@Column(name="d_drb12")
	private String d_drb12;
	
	@Column(name="d_dqb11")
	private String d_dqb11;
	
	@Column(name="d_dqb12")
	private String d_dqb12;
	
	@Column(name="date_fcit")
	private Date date_fcit;

	@Column(name="stat_don")
	private String stat_don;

	public DonneurMoelleMatchModel() {
		super();
	}


//	public String getIdPatient() {
//		return idPatient;
//	}
//
//	public void setIdPatient(String idPatient) {
//		this.idPatient = idPatient;
//	}

	public String getIdDonneur() {
		return idDonneur;
	}

	public void setIdDonneur(String idDonneur) {
		this.idDonneur = idDonneur;
	}

	public String getType_match() {
		return type_match;
	}

	public void setType_match(String type_match) {
		this.type_match = type_match;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getD_dna_a1() {
		return d_dna_a1;
	}

	public void setD_dna_a1(String d_dna_a1) {
		this.d_dna_a1 = d_dna_a1;
	}

	public String getD_dna_a2() {
		return d_dna_a2;
	}

	public void setD_dna_a2(String d_dna_a2) {
		this.d_dna_a2 = d_dna_a2;
	}

	public String getD_dna_b1() {
		return d_dna_b1;
	}

	public void setD_dna_b1(String d_dna_b1) {
		this.d_dna_b1 = d_dna_b1;
	}

	public String getD_dna_b2() {
		return d_dna_b2;
	}

	public void setD_dna_b2(String d_dna_b2) {
		this.d_dna_b2 = d_dna_b2;
	}

	public String getD_dna_c1() {
		return d_dna_c1;
	}

	public void setD_dna_c1(String d_dna_c1) {
		this.d_dna_c1 = d_dna_c1;
	}

	public String getD_dna_c2() {
		return d_dna_c2;
	}

	public void setD_dna_c2(String d_dna_c2) {
		this.d_dna_c2 = d_dna_c2;
	}

	public String getD_drb11() {
		return d_drb11;
	}

	public void setD_drb11(String d_drb11) {
		this.d_drb11 = d_drb11;
	}

	public String getD_drb12() {
		return d_drb12;
	}

	public void setD_drb12(String d_drb12) {
		this.d_drb12 = d_drb12;
	}

	public String getD_dqb11() {
		return d_dqb11;
	}

	public void setD_dqb11(String d_dqb11) {
		this.d_dqb11 = d_dqb11;
	}

	public String getD_dqb12() {
		return d_dqb12;
	}

	public void setD_dqb12(String d_dqb12) {
		this.d_dqb12 = d_dqb12;
	}

	public Date getDate_fcit() {
		return date_fcit;
	}

	public void setDate_fcit(Date date_fcit) {
		this.date_fcit = date_fcit;
	}

	public String getStat_don() {
		return stat_don;
	}

	public void setStat_don(String stat_don) {
		this.stat_don = stat_don;
	}
		
	
} 