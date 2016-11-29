package com.sd.ch8;
//import com.sd.ch8.*;

public class SeaTurtle extends Turtle {
	public void swim(){
		System.out.print("A sea turtle swims...");
	}
	public static void main(String args[]){
		SeaTurtle s = new SeaTurtle();
		s.swim();
		System.out.println("The number of leg : "+nLimbs);
		s.setFood("fish");
		s.eat();
	}
}