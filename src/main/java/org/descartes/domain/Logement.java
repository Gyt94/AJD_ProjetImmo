package org.descartes.domain;

public class Logement extends BienImmobilier {
	
	private TypeLogement typeLogement;
	
	public Logement(String ville, int budgetMini, int budgetMax) {
		super(ville, budgetMini, budgetMax);
		// TODO Auto-generated constructor stub
	}

	public TypeLogement getTypeLogement() {
		return typeLogement;
	}

	public void setTypeLogement(TypeLogement typeLogement) {
		this.typeLogement = typeLogement;
	}

}
