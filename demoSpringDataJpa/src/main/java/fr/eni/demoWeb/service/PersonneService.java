package fr.eni.demoWeb.service;

import java.util.List;

import fr.eni.demoWeb.bo.Personne;

public interface PersonneService {

	public List<Personne> rechercherToutesLesPersonnes();
	
	public void ajouterPersonne(Personne p);
	
}
