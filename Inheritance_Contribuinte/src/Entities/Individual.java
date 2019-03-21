package Entities;

public class Individual extends TaxPayer {
	private double healthExpenditure;

	public Individual() {
		super();
	}

	public Individual(String name, double anualInCome, double healthExpenditure) {
		super(name, anualInCome);
		this.healthExpenditure = healthExpenditure;
	}

	public double getHealthExpenditure() {
		return healthExpenditure;
	}

	public void setHealthExpenditure(double healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}

	@Override
	public double tax() {
		if(getAnualInCome() < 20000.00) {
			return getAnualInCome() * 0.15 - healthExpenditure *0.5;
		}else {
			return getAnualInCome() * 0.25 - healthExpenditure * 0.5;
		}
	}

}
