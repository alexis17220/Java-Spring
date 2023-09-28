package fr.eni.demoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.demoWeb.bo.Personne;

public interface PersonneRepo extends JpaRepository<Personne, Long>{
	public Personne findByNomAndPrenomOrderByNomDesc(String nom, String prenom);
	
	
}
