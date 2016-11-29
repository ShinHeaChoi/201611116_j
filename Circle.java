package com.sd.ch8;

public class Circle extends Point{
	private double radius;
	private double answer;
	public Circle(double r){
		radius = r;
	}
	public double getArea(){
		answer = (3.14)*radius*radius
	}
	public static void main(String args[]){
		Circle c=new Circle(5);
		double myArea = c.getArea();
		System.out.println(myArea);
	}
}