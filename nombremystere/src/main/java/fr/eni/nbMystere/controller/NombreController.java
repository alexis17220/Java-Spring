package fr.eni.nbMystere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.nbMystere.bll.NombreService;
import fr.eni.nbMystere.bo.Nombre;

@Controller
@SessionAttributes("nombre")
public class NombreController {
	
	private Nombre nombreMystere() { return new Nombre(); } 
	
	@Autowired
	private NombreService service;
	
	public NombreController(NombreService service) {
		this.service = service;
	}
	
	@GetMapping({"/", "/game"})
	public String accueil() {
		return "Nombre";
	}
	

	@PostMapping("/game/nombre")
	public String nombre(Model modele) {
		
		if(modele.getAttribute("nbmyst") == null){
			modele.addAttribute("nbmyst", this.nombreMystere());
		}
		modele.addAttribute("resultat","");
		modele.addAttribute("Précédent valeur","");
	//	modele.addAttribute("liste", )
		
		return "Nombre";
	}
}

