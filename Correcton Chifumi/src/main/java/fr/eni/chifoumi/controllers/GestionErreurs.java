package fr.eni.chifoumi.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import fr.eni.chifoumi.bll.ErreurChiFouMi;

@ControllerAdvice
public class GestionErreurs {

	@ExceptionHandler(ErreurChiFouMi.class)
	public String  handleChiFouMiErreur(Exception e, Model modele) {
		modele.addAttribute("message", e.getMessage());
		return "erreur";
	}

}
