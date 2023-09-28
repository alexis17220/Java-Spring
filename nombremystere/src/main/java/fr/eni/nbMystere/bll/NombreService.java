package fr.eni.nbMystere.bll;

import fr.eni.nbMystere.bo.Nombre;

public interface NombreService {
	public Nombre jouer(int choixJoueur) throws ErreurNombre;

}
