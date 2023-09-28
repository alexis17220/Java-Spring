package fr.eni.crayons.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import fr.eni.crayons.bo.Crayon;

@Service
public class CrayonServiceImpl implements CrayonService{

	private List<Crayon> listeCrayons;
	

	public CrayonServiceImpl() {
		listeCrayons = new ArrayList<>();
		listeCrayons.add(new Crayon(1, "bille", "bleu"));
		listeCrayons.add(new Crayon(2, "plume", "vert"));
	}
	
	@Override
	public List<Crayon> getCrayons() {
		return listeCrayons;
	}

	@Override
	public Crayon getCrayonById(int id) {
		Crayon crayonARetourner=null;
		for(Crayon crayon:listeCrayons)
		{
			if(crayon.getId()==id)
			{
				crayonARetourner=crayon;
				break;
			}
		}
		return crayonARetourner;
	}

	@Override
	public void ajouterCrayon(Crayon crayon) {
		listeCrayons.add(crayon);
		
	}

	@Override
	public void modifierCrayon(Crayon crayon) {
		for(Crayon c:listeCrayons)
		{
			if(c.getId()==crayon.getId())
			{
				BeanUtils.copyProperties(crayon, c);
				break;
			}
		}
		
	}

	@Override
	public void supprimerCrayon(Integer id) {
		for(Crayon c:listeCrayons)
		{
			if(c.getId()==id)
			{
				listeCrayons.remove(c);
				break;
			}
		}
		
		
	}

	@Override
	public void modifierCouleurCrayon(Integer id, Crayon crayon) {
		for(Crayon c:listeCrayons)
		{
			if(c.getId()==id)
			{
				//if( !c.getCouleur().equals("") ) {
				c.setCouleur(crayon.getCouleur());	
//				}
//				if(c.getType()!= null ) {
//					c.setType(crayon.getType());	
//				}
				
				break;
			}
		}
		
	}
	
}
