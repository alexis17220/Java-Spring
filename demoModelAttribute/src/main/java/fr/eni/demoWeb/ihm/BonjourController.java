package fr.eni.demoWeb.ihm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.demoWeb.bo.Personne;

@Controller
@RequestMapping("/dire")
public class BonjourController {
	
	//@ModelAttribute placé sur une méthode
	@ModelAttribute("testModelAttribut")
	public String getTestModelAttribut() {
		System.out.println("Dans getTestModelAttribut()");
		return "Valeur de testModelAttribut";
	}
	
	//@ModelAttribute placé sur une méthode
	@ModelAttribute("personnes")
	public List<Personne> getPersonnes(){
		return new ArrayList<Personne>();
	}

	//@ModelAttribute placé sur un paramètre
	@PostMapping("/hello")
	public String hello( @RequestParam  String prenom, 
			             @RequestParam int age,
			             @ModelAttribute("personnes") List<Personne> listePersonnes
			             ) {

		Personne pers = new Personne(prenom, age);
		
		listePersonnes.add(pers);
		
		return "pages/hello";
	}
	
	@GetMapping("/accueil")
	public String accueil() {
		return "redirect:/";
	}

}
