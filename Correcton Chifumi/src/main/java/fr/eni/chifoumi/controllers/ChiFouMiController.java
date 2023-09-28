package fr.eni.chifoumi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.chifoumi.bll.ChiFouMiService;
import fr.eni.chifoumi.bll.ErreurChiFouMi;
import fr.eni.chifoumi.bo.Partie;

@Controller
public class ChiFouMiController {
	
	private ChiFouMiService service;
	
	public ChiFouMiController(ChiFouMiService service) {
		this.service = service;
	}

	@GetMapping({"/", "/chifoumi"})
	public String accueil() {
		return "chifoumi";
	}
	
	@RequestMapping("/jouer")
	public String jouer(@RequestParam int choix, Model modele) throws ErreurChiFouMi {
		Partie partie = service.jouer(choix);
		
		modele.addAttribute("partie", partie);
		
		return "resultat";
	}
	
	
	
}
