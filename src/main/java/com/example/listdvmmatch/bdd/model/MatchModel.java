package com.example.listdvmmatch.bdd.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import com.example.listdvmmatch.tools.Tools;

// import javax.persistence.Table;


@Entity
// @Table(name = "MATCHMODEL")
@NamedStoredProcedureQuery(
		name="rechercherdvm",
		procedureName="rechercher_don_usp.don_comp",
		parameters = { @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "orig"), 
					   @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "pp_id") }) 

public class MatchModel implements Serializable {
	@Id
	@Column(name="orig")
	private String orig;

	@Column(name="pp_id")
	private String pp_id;

	public String getOrig() {
		return orig;
	}

	public void setOrig(String orig) {
		this.orig = orig;
	}

	public String getPp_id() {
		return Tools.concatId(pp_id);
	}

	public void setPp_id(String pp_id) {
		this.pp_id = pp_id;
	}
	
	
}
