package fr.eni.demoEntites;


import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.eni.demoEntites.bo.Adresse;
import fr.eni.demoEntites.bo.Civilite;
import fr.eni.demoEntites.bo.Personne;
import fr.eni.demoEntites.dal.CiviliteRepository;
import fr.eni.demoEntites.dal.PersonneRepository;

@SpringBootApplication
public class DemoEntitesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEntitesApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PersonneRepository persDAO,
			CiviliteRepository civiliteDAO) {
		return (args) -> {
			Civilite c1 = new Civilite("M", "Monsieur");
			Civilite c2 = new Civilite("Mlle", "Mademoiselle");
			Civilite c3 = new Civilite("Mme", "Madame");
			civiliteDAO.save(c1);
			civiliteDAO.save(c2);
			civiliteDAO.save(c3);
			
			Personne albert = new Personne("Dupontel", "Albert");
			Personne jack = new Personne("Lemmon", "Jack");
			Personne sophie = new Personne("Marceau", "Sophie");
			
			albert.setCivilite(c1);
			sophie.setCivilite(c3);
			jack.setCivilite(c1);
			
			persDAO.save(albert);
			persDAO.save(sophie);
			persDAO.save(jack);
			
			System.out.println("Liste des personnes : ");
			System.out.println("-------------------------------");
			for (Personne personne : persDAO.findAll()) {
				System.out.println(personne.toString());
			}
			
			
		};
	}
}
