package fr.eni.nbMystere.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import fr.eni.nbMystere.bll.ErreurNombre;

@ControllerAdvice
public class GestionErreurs {

	@ExceptionHandler(ErreurNombre.class)
	public String  handleChiFouMiErreur(Exception e, Model modele) {
		modele.addAttribute("message", e.getMessage());
		return "erreur";
	}

}