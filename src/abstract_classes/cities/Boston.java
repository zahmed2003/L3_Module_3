package abstract_classes.cities;

public class Boston extends City {
	int population;
	double growthRate;
	double tax;
	
	public Boston(int population, double growthRate) {
		super(population, growthRate);
		
		this.population = population;
		this.growthRate = growthRate;
	}

	@Override
	double getAnnualTaxes() {
		tax = population*growthRate + population*0.5;
		return tax;
	}

}
