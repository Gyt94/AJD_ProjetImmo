package org.descartes.domain;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;

@Entity
@JsonTypeName("Logement")
public class Logement extends BienImmobilier {
	
	private TypeLogement typeLogement;
	
	public Logement() {
		super();
	}
	
	public Logement(String ville, int budgetMini, int budgetMax, TypeLogement typeLogement) {
		super(ville, budgetMini, budgetMax);
		this.typeLogement = typeLogement;
	}

	public TypeLogement getTypeLogement() {
		return typeLogement;
	}

	public void setTypeLogement(TypeLogement typeLogement) {
		this.typeLogement = typeLogement;
	}

}
