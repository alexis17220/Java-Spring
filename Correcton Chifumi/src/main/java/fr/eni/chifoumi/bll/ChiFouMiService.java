package fr.eni.chifoumi.bll;


import fr.eni.chifoumi.bo.Partie;

public interface ChiFouMiService  {

	public Partie jouer(int choixJoueur) throws ErreurChiFouMi;
	
}
