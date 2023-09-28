package fr.eni.chifumi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.chifumi.bo.Game;
import fr.eni.chifumi.service.GameService;

@Controller
public class GameController {
	
	private GameService gameService;
	
	public GameController(GameService gameService) {
		
	}
	
	@RequestMapping({ "/", "/home" })
	public String game() {
		System.out.println("passe par la");
		return "jeu";
	}
	
    @GetMapping("/resultat")
    public String game(@RequestParam (required = false, defaultValue = "world") String jeu, Model modele) {
        System.out.println("Jeu recu = " + jeu);
        Game game = new Game(jeu);
        modele.addAttribute("game", game);
        return "resultat";
    }
	
    @PostMapping("/resultat")
    // @RequestMapping(path = "/bonjour", method = RequestMethod.POST)
     public String gamePlay(@RequestParam String jeu, Model modele) {
         //System.out.println("prenom recu = " + prenom);
        System.out.println("Jeu recu = " + jeu);
         Game game = new Game(jeu);
         modele.addAttribute("game", game);

         return "resultat";
     }
	
	
}
