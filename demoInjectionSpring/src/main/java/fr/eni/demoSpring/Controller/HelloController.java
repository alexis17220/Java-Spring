package fr.eni.demoSpring.Controller;

import fr.eni.demoSpring.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
@Autowired
//@Qualifier("helloServiceFrancaisImpl")
    private HelloService helloService;

    //injection par constructeur
  /*  @Autowired
    public HelloController(HelloService helloService){
    this.helloService = helloService;
    }*/

    public void sayHello(){
        System.out.println(helloService.hello());
    }

    //injection par setter
    /*@Autowired
    public void setHelloService(HelloService helloService){
        this.helloService=helloService;
    }*/


}
