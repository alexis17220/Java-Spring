package fr.eni.demoEntites;


import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.eni.demoEntites.bo.Adresse;
import fr.eni.demoEntites.bo.Personne;
import fr.eni.demoEntites.dal.AdresseRepository;
import fr.eni.demoEntites.dal.PersonneRepository;

@SpringBootApplication
public class DemoEntitesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEntitesApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PersonneRepository persDAO,
			AdresseRepository adresseDAO) {
		return (args) -> {
			// save a few customers
			Adresse a1 = new Adresse("44000", "Nantes");
			Adresse a2 = new Adresse("33000", "Bordeaux");
			Adresse a3 = new Adresse("29000", "Brest");
			Adresse a4 = new Adresse("74000", "Chamonix");
			
			Personne albert = new Personne("Dupontel", "Albert");
			Personne sophie = new Personne("Marceau", "Sophie");
			
			albert.addAdresse(a1);
			albert.addAdresse(a2);
			sophie.addAdresse(a3);
			sophie.addAdresse(a4);
			
			persDAO.save(albert);
			persDAO.save(sophie);
			
			System.out.println("Liste des personnes : ");
			System.out.println("-------------------------------");
			for (Personne personne : persDAO.findAll()) {
				System.out.println(personne.toString());
			}
			
			//albert.setAdresses(new ArrayList<Adresse>());
			albert.getAdresses().remove(0);
			persDAO.save(albert);			
			
			System.out.println("Détachement des adresses de albert : ");
			System.out.println("-------------------------------");
			for (Adresse adr : adresseDAO.findAll()) {
				System.out.println(adr.toString());
			}

			
			
		};
	}
}
