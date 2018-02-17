package abstract_classes.cities;

public class SanDiego extends City {

	int population;
	double growthRate;
	double tax;
	
	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		
		this.population = population;
		this.growthRate = growthRate;
	}

	@Override
	double getAnnualTaxes() {
		tax = 1000000 + population*growthRate;
		return tax;
	}

	
}
