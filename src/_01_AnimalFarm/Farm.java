package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	static Cow cow = new Cow(270.3);
	static Duck duck = new Duck(0.9);
	static Horse Akira = new Horse(502.4);
	static Pig pig = new Pig(23.1);
	static Horse Dino = new Horse(721.8);
	static Cow DotDot = new Cow(0.4);
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(cow);
		animals.add(duck);
		animals.add(Akira);
		animals.add(pig);
		animals.add(Dino);
		animals.add(DotDot);
		for(int i=0; i<animals.size(); i++) {
			animals.get(i).makeNoise();
			animals.get(i).weight();
		}
	}
}
