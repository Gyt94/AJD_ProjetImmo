package org.descartes.domain;

public abstract class BienImmobilier {

	private String ville;
	private int budgetMini;
	private int budgetMax;
	
	public BienImmobilier() {
		super();
	}
	
	public BienImmobilier(String ville, int budgetMini, int budgetMax) {
		super();
		this.ville = ville;
		this.budgetMini = budgetMini;
		this.budgetMax = budgetMax;
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
