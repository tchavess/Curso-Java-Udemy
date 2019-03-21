package Entities;

public abstract class TaxPayer {
	private String name;
	private double anualInCome;
	public TaxPayer() {
	}
	public TaxPayer(String name, double anualInCome) {
		this.name = name;
		this.anualInCome = anualInCome;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAnualInCome() {
		return anualInCome;
	}
	public void setAnualInCome(double anualInCome) {
		this.anualInCome = anualInCome;
	}
	
	public abstract double tax() ;
	
	
	
	

}
