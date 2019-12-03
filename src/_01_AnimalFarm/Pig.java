package _01_AnimalFarm;

public class Pig extends Animal{
	double weight;
	Pig(double weight){
		this.weight=weight;
	}
	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Oink");
	}
	@Override
	void weight() {
		// TODO Auto-generated method stub
		System.out.println(weight);
	}

}
