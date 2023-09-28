package fr.eni.crayons.service;

import java.util.List;

import fr.eni.crayons.bo.Crayon;

public interface CrayonService {

	List<Crayon> getCrayons();

	Crayon getCrayonById(int id);

	void ajouterCrayon(Crayon crayon);

	void modifierCrayon(Crayon crayon);

	void supprimerCrayon(Integer id);

	void modifierCouleurCrayon(Integer id, Crayon crayon);
}
