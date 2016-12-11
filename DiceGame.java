package com.sd.yutGame;

public class DiceGame {
	public Player p1;
	public Player p2;
	public void setName(String nameA,String nameB) {
		p1 = new Player(nameA);
		p2 = new Player(nameB);
	}
	public void startGame() {
		p1.play();
		p2.play();
		int scoreA = p1.getNum();
		int scoreB = p2.getNum();

		if (scoreA > scoreB) {
			System.out.println(p1.getName() + " winner");
		}
		else if (scoreA < scoreB) {
			System.out.println(p2.getName() + " winner");
		}
		else
			System.out.println("draw");
		}
}