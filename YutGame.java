package com.sd.yutGame;

public class YutGame extends DiceGame {
	public Player p1;
	public Player p2;
	public int scoreA;
	public int scoreB;
	public String result1;
	public String result2;
	public String answer;
	public void setName(String nameA,String nameB) {
		p1 = new Player(nameA);
		p2 = new Player(nameB);
	}
	public String setYut(socre){
		if(socre == 2){
			return answer = 'Back Do';
		}
		else if(socre == 3){
			return answer = 'Do';
		}
		else if(socre == 4){
			return answer = 'Ge';
		}
		else if(socre == 5){
			return answer = 'Gul';
		}
		else if(socre == 6){
			return answer = 'Yut';
		}
		else{
			return answer = 'Mo';
		}
	}
	public void startGame() {
		p1.play();
		p2.play();
		scoreA = p1.getNum();
		scoreB = p2.getNum();
		YutGame y = new YutGame();
		result1 = y.setYut(scoreA);
		result2 = y.setYut(scoreB);
		System.out.println(p1.getName()+result1);
		System.out.println(p2.getName()+result2);
		if(scoreA>scoreB){
			System.out.println(p1.getName()+"winner");
		}
		else if(scoreA<scoreB){
			System.out.println(p2.getName()+"winner");
		}
		else{
			System.out.println(p1.getName()+p2.getName()+"draw");
		}
	}
}
		
