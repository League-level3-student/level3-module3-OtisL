package _01_AnimalFarm;

public class Cow extends Animal{
	double weight;
	Cow(double weight){
		this.weight=weight;
	}
	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Moo");
	}
	@Override
	void weight() {
		// TODO Auto-generated method stub
		System.out.println(weight);
	}

}
