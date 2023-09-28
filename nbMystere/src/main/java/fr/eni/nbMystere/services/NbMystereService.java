package fr.eni.nbMystere.services;

import fr.eni.nbMystere.bo.Partie;

public interface NbMystereService {
	
	void faireUneProposition(Partie partie,  int nouvelleProposition) ;
	
	void arreter(Partie partie);
}
