package com.sd.yutGame;

public class Yut extends Dice { 
	private int number = 0;
	public void roll() {   
		number = (int) (Math.random() * 6)+1;
		return this.number;
	} 
	public void setNum(int number) {
		this.number = number;
	}
	public int getNum(){
		return this.number;
	}
}