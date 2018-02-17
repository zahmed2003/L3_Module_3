package abstract_classes.cities;

public class LosAngeles extends City {
	int population;
	double growthRate;
	double tax;
	
	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		
		this.population = population;
		this.growthRate = growthRate;
	}

	@Override
	double getAnnualTaxes() {
		tax = (population*growthRate)*(growthRate/2);
		return tax;
	}
}
