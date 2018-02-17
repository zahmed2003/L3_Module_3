package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
	

	public static void main(String[] args) {
		
		Chicken c1 = new Chicken();
		Pig p1 = new Pig();
		Cow co1 = new Cow();
		Sheep s1 = new Sheep();
		Chicken c2 = new Chicken();
		Pig p2 = new Pig();
		
		ArrayList<Animal> farm = new ArrayList<Animal>();
		farm.add(c1);
		farm.add(c2);
		farm.add(p1);
		farm.add(p2);
		farm.add(co1);
		farm.add(s1);
		
		for(Animal a : farm)
		{
			a.makeNoise();
		}
	}

}
