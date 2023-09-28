package fr.eni.demoWeb.services;

import fr.eni.demoWeb.repository.PersonneRepo;

public class MonService {

	private PersonneRepo personneRepo;
	
	public MonService(PersonneRepo personneRepo) {
		this.personneRepo = personneRepo;
	}
	
	public void maMethodeMetier() {
		
	}
	
}
