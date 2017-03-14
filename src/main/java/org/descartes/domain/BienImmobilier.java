package org.descartes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME)
@JsonSubTypes({
		@JsonSubTypes.Type(value=Logement.class, name="Logement"),
		@JsonSubTypes.Type(value=Terrain.class, name="Terrain")
})
public abstract class BienImmobilier {

	private String ville;
	private int budgetMini;
	private int budgetMax;
	private long id;
	
	
	public BienImmobilier() {
		super();
	}
	
	public BienImmobilier(String ville) {
		super();
		this.ville = ville;
	}
	
	public BienImmobilier(String ville, int budgetMini, int budgetMax) {
		super();
		this.ville = ville;
		this.budgetMini = budgetMini;
		this.budgetMax = budgetMax;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getBudgetMini() {
		return budgetMini;
	}

	public void setBudgetMini(int budgetMini) {
		this.budgetMini = budgetMini;
	}

	public int getBudgetMax() {
		return budgetMax;
	}

	public void setBudgetMax(int budgetMax) {
		this.budgetMax = budgetMax;
	}
	
}
