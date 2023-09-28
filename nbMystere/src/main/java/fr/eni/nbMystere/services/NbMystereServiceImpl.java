package fr.eni.nbMystere.services;

import java.util.Random;

import org.springframework.stereotype.Service;

import fr.eni.nbMystere.bo.Partie;

@Service
//@Scope("session")
public class NbMystereServiceImpl implements NbMystereService{

	
	
	private static Random random = new Random();
	
	@Override
	public void faireUneProposition(Partie partie, int nouvelleProposition) {
		
		//Cas nouvelle partie
		if(partie.getResultat()<=Partie.GAGNE) {
			partie.reinitialiser();
			partie.setNbMystere(random.nextInt(Partie.MAX)+1);
		}
		
		partie.coupSuivant();
		
		if(nouvelleProposition==partie.getNbMystere()) {
			partie.setResultat(Partie.GAGNE);
			return;
		}

		if(partie.getNbCoups()==Partie.NB_COUPS_MAX) {
			partie.setResultat(Partie.PERDU);			
		}else if(nouvelleProposition>partie.getNbMystere()) {
			partie.setResultat(Partie.MOINS);
			
		}else {
			
			partie.setResultat(Partie.PLUS);
		}
		
	}

	@Override
	public void arreter(Partie partie) {
		partie.reinitialiser();
		
	}

}
