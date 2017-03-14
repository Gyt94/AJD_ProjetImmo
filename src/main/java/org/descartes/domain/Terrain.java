package org.descartes.domain;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;

@Entity
@JsonTypeName("Terrain")
public class Terrain extends BienImmobilier {

	public Terrain() {
		super();
	}

	public Terrain(String ville, int budgetMini, int budgetMax) {
		super(ville, budgetMini, budgetMax);
	}

}
