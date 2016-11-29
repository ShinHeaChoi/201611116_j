package com.sd.ch8;
//import com.sd.ch8.*;

public class LandTurtle extends Turtle {
	public void walk(){
		System.out.print("A land turtle walks...");
	}
	public static void main(String args[]){
		LandTurtle s = new LandTurtle();
		s.walk();
		System.out.println("The number of leg : "+nLimbs);
		s.setFood("weeds");
		s.eat();
	}

}