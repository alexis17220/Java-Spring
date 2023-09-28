package fr.eni.demoEntites.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AdresseOTM")
public class Adresse {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String codePostal;
	private String ville;
	
	public Adresse() {
		// TODO Auto-generated constructor stub
	}

	public Adresse( String codePostal, String ville) {
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}



	

}
