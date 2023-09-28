package fr.eni.nbMystere.bo;

public class Partie {

	public static final int MAX = 50;
	public static final int NB_COUPS_MAX = 10; 
	
	public static final int INDEFINI = 0;
	public static final int PERDU = 1;
	public static final int GAGNE = 2;
	public static final int MOINS = 3;
	public static final int PLUS = 4;
	
	
	
	private Integer nbMystere;
	
	private int nbCoups;
	
	private int resultat;
	
	private int proposition;

	public Partie() {
		nbCoups = 0;
		resultat = INDEFINI;
	}
	
	public Partie(int proposition) {
		super();
		this.proposition = proposition;
	}
	
	
	public int getNbCoups() {
		return nbCoups;
	}

	public void setNbCoups(int nbCoups) {
		this.nbCoups = nbCoups;
	}

	public int getResultat() {
		return resultat;
	}

	public void setResultat(int resultat) {
		this.resultat = resultat;
	}

	public int getProposition() {
		return proposition;
	}

	public void setProposition(int proposition) {
		this.proposition = proposition;
	}


	public Integer getNbMystere() {
		return nbMystere;
	}

	public void setNbMystere(Integer nbMystere) {
		this.nbMystere = nbMystere;
	}

	public void coupSuivant() {
		nbCoups++;
		
	}

	public int getNbTentativesRestantes() {
		return NB_COUPS_MAX - nbCoups;
	}
	
	public void reinitialiser() {
		nbMystere = 0;
		nbCoups = 0;
		resultat = INDEFINI;
		
	}

	@Override
	public String toString() {
		return "Partie [nbMystere=" + nbMystere + ", nbCoups=" + nbCoups + ", resultat=" + resultat + ", proposition="
				+ proposition + "]";
	}
	
}
