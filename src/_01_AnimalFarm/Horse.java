
package _01_AnimalFarm;

public class Horse extends Animal{
	double weight;
	Horse(double weight){
		this.weight=weight;
	}
	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Neigh");
	}
	@Override
	void weight() {
		// TODO Auto-generated method stub
		System.out.println(weight);
	}

}
