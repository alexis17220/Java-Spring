package fr.eni.demoCouplageFortFaible;

public class HelloController {
	
	//private HelloServiceImpl helloService;
private HelloService helloService;

	public HelloController(HelloService helloService) {
		//helloService = new HelloServiceImpl();//couplage fort
		this.helloService = helloService; // Couplage faible
	}

	public void afficherHello() {
		System.out.println(helloService.sayHello());
	}

}
