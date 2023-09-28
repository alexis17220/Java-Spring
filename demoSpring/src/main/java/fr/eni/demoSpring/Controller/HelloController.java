package fr.eni.demoSpring.Controller;

import fr.eni.demoSpring.bo.Personne;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
//@Autowired
//@Qualifier("helloServiceFrancaisImpl")
    //private HelloService helloService;

    //injection par constructeur
  /*  @Autowired
    public HelloController(HelloService helloService){
    this.helloService = helloService;
    }*//*
    public void sayHello(){
        System.out.println(helloService.hello());
    }*/

    //injection par setter
    /*@Autowired
    public void setHelloService(HelloService helloService){
        this.helloService=helloService;
    }*/
    /*
     * Affichage de la page d'accueil
     */
    @RequestMapping({"/","/hello"})
    public String hello() {
        System.out.println("passe par la");
        return "hello";
    }

    /*
    route vers bonjours
     */
    @PostMapping("/bonjour")
   // @RequestMapping(path = "/bonjour", method = RequestMethod.POST)
    public String bonjour(@RequestParam String prenom, Model modele) {
        //System.out.println("prenom recu = " + prenom);
        Personne pers = new Personne(prenom);
        modele.addAttribute("personne", pers);

        return "redirect:/bonjour?prenom"+pers.getPrenom();
    }


   // @RequestMapping(path = "/bonjour", method = RequestMethod.GET)
    @GetMapping("/bonjour")
    public String bonjourGet(@RequestParam (required = false, defaultValue = "world") String prenom, Model modele) {
        System.out.println("prenom recu = " + prenom);
        Personne pers = new Personne(prenom);
        modele.addAttribute("personne", pers);
        return "bonjour";
    }
    @GetMapping("/bonjour/{id}/{prenom}")
    public String getBonjourPath(@PathVariable int id, @PathVariable String prenom) {
        System.out.println("id recu = " + id + ", prenom recu = " + prenom);
        return "bonjour";
    }
}
