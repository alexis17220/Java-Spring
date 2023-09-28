package fr.eni.chifoumi.bll;

import java.util.Random;

import org.springframework.stereotype.Service;

import fr.eni.chifoumi.bo.Partie;

@Service
public class ChiFouMiServiceImpl implements ChiFouMiService{
	
	private Random random;
	
	public ChiFouMiServiceImpl() {
		random = new Random();
	}

	@Override
	public Partie jouer(int choixJoueur) throws ErreurChiFouMi {
		if(choixJoueur <Partie.PIERRE || choixJoueur > Partie.CISEAUX) {
			throw new ErreurChiFouMi("choix joueur incorrect");
		}
		
		Partie partie = new Partie(choixJoueur);
		
		//choix ordinateur
		partie.setChoixOrdinateur(random.nextInt(3)+1);
		
		if(partie.getChoixJoueur()==partie.getChoixOrdinateur()) {
			partie.setResultat(Partie.EGALITE);
		}else if(
			(partie.getChoixJoueur()==Partie.PIERRE && partie.getChoixOrdinateur()==Partie.CISEAUX)
			|| (partie.getChoixJoueur()==Partie.FEUILLE && partie.getChoixOrdinateur()==Partie.PIERRE)
			|| (partie.getChoixJoueur()==Partie.CISEAUX && partie.getChoixOrdinateur()==Partie.FEUILLE)) {
			partie.setResultat(Partie.VICTOIRE_JOUEUR);
		}else {
			partie.setResultat(Partie.VICTOIRE_ORDI);
		}
		
		return partie;
	}

}
