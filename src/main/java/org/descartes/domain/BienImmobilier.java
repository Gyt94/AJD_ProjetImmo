package org.descartes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class BienImmobilier {

	private String ville;
	private int budgetMini;
	private int budgetMax;
	private TypeLogement typeLogement;
	private long id;
	
	
	public BienImmobilier() {
		super();
	}
	
	public BienImmobilier(String ville) {
		super();
		this.ville = ville;
	}
	
	public BienImmobilier(String ville, int budgetMini, int budgetMax, TypeLogement typeLogement) {
		super();
		this.ville = ville;
		this.budgetMini = budgetMini;
		this.budgetMax = budgetMax;
		this.typeLogement = typeLogement;
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

	public TypeLogement getTypeLogement() {
		return typeLogement;
	}

	public void setTypeLogement(TypeLogement typeLogement) {
		this.typeLogement = typeLogement;
	}
	
}
