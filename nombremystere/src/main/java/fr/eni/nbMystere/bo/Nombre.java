package fr.eni.nbMystere.bo;

public class Nombre {

	private String jeu;
	
	private int choixJoueur;
	private int choixOrdinateur;
	private int resultat;
	
	public static int VICTOIRE_JOUEUR = 1;
	public static int VICTOIRE_ORDI = 2;
	
	
	public Nombre() {

	}

	public Nombre(int choixJoueur) {
		super();
		this.choixJoueur = choixJoueur;
	}

	public String getJeu() {
		return jeu;
	}

	
	public void setJeu(String jeu) {
		this.jeu = jeu;
	}


	public int getChoixJoueur() {
		return choixJoueur;
	}

	public void setChoixJoueur(int choixJoueur) {
		this.choixJoueur = choixJoueur;
	}

	public int getChoixOrdinateur() {
		return choixOrdinateur;
	}

	public void setChoixOrdinateur(int choixOrdinateur) {
		this.choixOrdinateur = choixOrdinateur;
	}

	public int getResultat() {
		return resultat;
	}

	public void setResultat(int resultat) {
		this.resultat = resultat;
	}
	
	@Override
	public String toString() {
		return "Nombre [choixJoueur=" + choixJoueur + "]";
	}
}
