package abstract_classes.cities;

public class Atlanta extends City {
	int population;
	double growthRate;
	double tax;
	
	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		
		this.population = population;
		this.growthRate = growthRate;
	}

	@Override
	double getAnnualTaxes() {
		tax = (population*growthRate)*(2*growthRate);
		return tax;
	}
}
