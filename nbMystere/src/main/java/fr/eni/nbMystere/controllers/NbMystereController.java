package fr.eni.nbMystere.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.nbMystere.bo.Partie;
import fr.eni.nbMystere.services.NbMystereService;


@Controller
@SessionAttributes({"partie"})
public class NbMystereController {
	
	private NbMystereService service;
	
	public NbMystereController(NbMystereService service) {
		this.service = service;
	}
	
//	@ModelAttribute("partie")
//	public Partie getPartie() {		
//		System.out.println("Dans NbMystereController-getPartie");
//		return new Partie();
//	}

	
	@GetMapping({"/", "/jeu"})
	public String jeu(Model model) {
		model.addAttribute("partie", new Partie());
		return "jeu";
	}
	
	@PostMapping({ "/jouer"})
	public String jouer( @RequestParam String proposition, 
			Model modele) {
		int prop = 0;
		try {
			prop = Integer.parseInt(proposition);
		}catch(NumberFormatException e) {
			modele.addAttribute("erreur", "La proposition doit etre un nombre entier.");
			return "jeu";
		}
		Partie partie = (Partie) modele.getAttribute("partie");
		
		service.faireUneProposition(partie, prop);
		
		return "jeu";
	}
	
	@PostMapping({ "/arreter"})
	public String arreter( Model modele) {
		Partie partie = (Partie) modele.getAttribute("partie");
		service.arreter(partie);
		
		return "jeu";
	}

}
