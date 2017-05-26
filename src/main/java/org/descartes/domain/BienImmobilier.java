package org.descartes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BienImmobilier {

	private String ville;
	private int prix;
	private TypeLogement typeLogement;
	private long id;
	private boolean estLoue;

	public BienImmobilier() {
		super();
	}
	
	public BienImmobilier(String ville, int prix, TypeLogement typeLogement, boolean estLoue) {
		super();
		this.ville = ville;
		this.prix = prix;
		this.typeLogement = typeLogement;
		this.estLoue = estLoue;
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

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public TypeLogement getTypeLogement() {
		return typeLogement;
	}

	public void setTypeLogement(TypeLogement typeLogement) {
		this.typeLogement = typeLogement;
	}
	
	public boolean isEstLoue() {
		return estLoue;
	}

	public void setEstLoue(boolean estLoue) {
		this.estLoue = estLoue;
	}
	
}
