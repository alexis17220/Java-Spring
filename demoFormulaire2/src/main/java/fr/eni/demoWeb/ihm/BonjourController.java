package fr.eni.demoWeb.ihm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.demoWeb.bo.Personne;

@Controller
@SessionAttributes("personnes")
public class BonjourController {
	
	@ModelAttribute("personnes")
	public List<Personne> getPersonnes(){
		return new ArrayList<Personne>();
	}

	@GetMapping({ "", "/accueil"})
	public String accueil(Model modele) {
		modele.addAttribute("personne", new Personne("Votre nom", 1));
		return "index";
	}
	
	@PostMapping("/accueil")
	public String traitFormulaire( @ModelAttribute("personne") Personne personne,
			             @ModelAttribute("personnes") List<Personne> listePersonnes
			             ) {

		listePersonnes.add(personne);
		
		return "index";
	}
	

}
