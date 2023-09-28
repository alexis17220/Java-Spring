package fr.eni.chifumi.bo;

public class Game {

	private String jeu;
	
	
    public Game(){

    }

    public Game(String jeu){
        super();
        this.jeu = jeu;
    }


	public String getJeu() {
		return jeu;
	}

	public void setJeu(String jeu) {
		this.jeu = jeu;
	}

	@Override
	public String toString() {
		return "Game [jeu=" + jeu + "]";
	}
	
}
