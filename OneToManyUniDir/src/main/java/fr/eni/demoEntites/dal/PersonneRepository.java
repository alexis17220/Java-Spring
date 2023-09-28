package fr.eni.demoEntites.dal;

import org.springframework.data.repository.CrudRepository;

import fr.eni.demoEntites.bo.Personne;

public interface PersonneRepository extends CrudRepository<Personne, Integer>{

}
