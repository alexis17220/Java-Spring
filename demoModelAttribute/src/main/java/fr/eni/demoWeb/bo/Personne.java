package fr.eni.demoWeb.bo;

public class Personne {
	private String prenom;
	private int age;
	
	public Personne() {
	}
	
	public Personne(String nom,  int age) {
		super();
		this.prenom = nom;
		this.age = age;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String nom) {
		this.prenom = nom;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", age=" + age + "]";
	}

}
