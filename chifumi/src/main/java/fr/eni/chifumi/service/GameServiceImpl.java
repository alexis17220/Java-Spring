package fr.eni.chifumi.service;

import java.util.Random;

public class GameServiceImpl implements GameService{

	public String generateComputerMove() {    
		String[] moves = {"shi.png", "fou.png", "mi.png"};    
		Random random = new Random();    
		int index = random.nextInt(3);
		System.out.println(index);
		return moves[index];
	}
	
	
	@Override
	public String Game() {
		// TODO Auto-generated method stub
		return null;
	}

}
