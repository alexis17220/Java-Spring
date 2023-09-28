package fr.eni.demoWeb.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "PERSONNES")
public class Personne  {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length = 50, nullable = false)
	private String prenom;
	
	@Basic(optional = false)
	private String nom;
	
	@Transient
	private Integer age;
	
	public Personne() {
	}
	
	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String nom) {
		this.prenom = nom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	@Override
	public String toString() {
		return "Personne [id=" + id + ", prenom=" + prenom + ", nom=" + nom + "]";
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}



}
