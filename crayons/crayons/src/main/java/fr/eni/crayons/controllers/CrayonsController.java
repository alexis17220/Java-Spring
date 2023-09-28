package fr.eni.crayons.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrayonsController {

	
	@GetMapping({"", "/", "/index"})
	public String affichePageCrayons() {
		return "index";
	}
	
}
