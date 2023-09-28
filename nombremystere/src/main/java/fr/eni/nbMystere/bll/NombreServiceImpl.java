package fr.eni.nbMystere.bll;

import java.util.Random;

import org.springframework.stereotype.Service;

import fr.eni.nbMystere.bo.Nombre;

@Service
public class NombreServiceImpl implements NombreService{


	private Random random;
	
	public NombreServiceImpl() {
		random = new Random();
	}

	@Override
	public Nombre jouer(int choixJoueur) throws ErreurNombre {
		if(choixJoueur < 1 || choixJoueur > 2) {
			throw new ErreurNombre("");
		}
		
	Nombre partie = new Nombre(choixJoueur);
		
		//choix ordinateur
		partie.setChoixOrdinateur(random.nextInt(50)+1);
		if(partie.getChoixJoueur()==partie.getChoixOrdinateur()) {
			partie.setResultat(Nombre.VICTOIRE_JOUEUR);
		}/*else if (partie.getChoixJoueur()> partie.getChoixOrdinateur()) {
		}else if(partie.getChoixJoueur()< partie.getChoixOrdinateur()) {

		}*/else {
			partie.setResultat(Nombre.VICTOIRE_ORDI);
		}return partie;
	}

}
