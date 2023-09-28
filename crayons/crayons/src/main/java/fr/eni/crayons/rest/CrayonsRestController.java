package fr.eni.crayons.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.eni.crayons.bo.Crayon;
import fr.eni.crayons.service.CrayonService;

@RestController
@RequestMapping("/rest")
public class CrayonsRestController {
	
	private CrayonService crayonService;
	
	public CrayonsRestController(CrayonService crayonService) {
		this.crayonService = crayonService;
	}
	
	@GetMapping("/crayons")
	public List<Crayon> getCrayons(){
		return crayonService.getCrayons();
	}

	
	@GetMapping("/crayons/{id}")
	public Crayon getCrayon(@PathVariable("id") int id)
	{
		Crayon crayon = crayonService.getCrayonById(id);
		System.out.println("getCrayon : " + crayon);
		return crayon;
	}
	
//	@PostMapping("/crayons")
//	@ResponseStatus(code = HttpStatus.CREATED)
//	public Crayon ajouterCrayon(@RequestBody Crayon crayon)
//	{
//		crayonService.ajouterCrayon(crayon);
//		
//		return crayon;
//	}
	
	@PostMapping("/crayons")
	public ResponseEntity<Crayon> ajouterCrayon(@RequestBody Crayon crayon)
	{
		
		if(crayon.getId()<=0) {
			return new ResponseEntity<Crayon>(HttpStatus.BAD_REQUEST);
		}
		
		crayonService.ajouterCrayon(crayon);
		
		return new ResponseEntity<Crayon>(crayon, HttpStatus.CREATED);
	}

	//@RequestMapping(path = "/crayons", method = RequestMethod.PUT)
	@PutMapping("/crayons")
	public Crayon modifierCrayon(@RequestBody Crayon crayon)
	{
		crayonService.modifierCrayon(crayon);
		
		return crayon;
	}
	
	@PatchMapping("/crayons/{id}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public void modifierCouleurCrayon(@PathVariable Integer id, @RequestBody Crayon crayon)
	{
		crayonService.modifierCouleurCrayon(id, crayon);
				
	}
	
	//@RequestMapping(path = "/crayons/{id}", method = RequestMethod.DELETE)
	@DeleteMapping("/crayons/{id}")
	public void supprimerCrayon(@PathVariable("id") Integer id)
	{
		crayonService.supprimerCrayon(id);
		
	}
}
