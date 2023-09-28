package fr.eni.demoSpring;

import fr.eni.demoSpring.Controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoInjectionSpringApplication {

	public static void main(String[] args) {
		ApplicationContext appContext= SpringApplication.run(DemoInjectionSpringApplication.class, args);
		HelloController helloController = appContext.getBean(HelloController.class);
		helloController.sayHello();
	}

}
