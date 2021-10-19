package game;

import game.objects.*;

public class Game {
	
	GameObject[] objects = {new Scissors(), new Rock(), new Paper()};
	
	public void run() {
		System.out.println("게임 시작...");
	
		for(GameObject ob : objects) {
		System.out.println(ob.toString());
		}
	}

}
