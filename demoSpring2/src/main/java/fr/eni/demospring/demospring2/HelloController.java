package fr.eni.demospring.demospring2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    /*
     * Affichage de la page d'accueil
     */
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("passe par la");
        return "Hello";
    }

}
