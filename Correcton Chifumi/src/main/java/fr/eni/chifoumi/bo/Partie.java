package fr.eni.chifoumi.bo;

public class Partie {
	
	public static int PIERRE = 1;
	public static int FEUILLE = 2;
	public static int CISEAUX = 3;

	public static int EGALITE = 1;
	public static int VICTOIRE_JOUEUR = 2;
	public static int VICTOIRE_ORDI = 3;
	
	private int choixJoueur;
	private int choixOrdinateur;
	private int resultat;
	
	public Partie() {
		// TODO Auto-generated constructor stub
	}

	public Partie(int choixJoueur) {
		super();
		this.choixJoueur = choixJoueur;
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
		return "Partie [choixJoueur=" + choixJoueur + "]";
	}
	
}
