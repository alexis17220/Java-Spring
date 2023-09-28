package fr.eni.demoCouplageFortFaible;

public class MonAppli {
	public static void main(String[] args) {
		//HelloController helloCtrler = new HelloController();

		//injection par setter
		//HelloController helloCtrler = new HelloController();
		//helloCtrler.setHelloService(new HelloServiceImpl());

		//injection de dépendance PAR CONSTRUCTEUR
		HelloController helloCtrler = new HelloController(new HelloServiceImpl());
		
		
		helloCtrler.afficherHello();
	}
}
