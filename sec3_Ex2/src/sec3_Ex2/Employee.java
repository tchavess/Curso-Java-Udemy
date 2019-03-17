package sec3_Ex2;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		double p = (grossSalary - tax) ;
		return p;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
public String toString() {
	
	return name 
		+ ", $ "
		+ String.format("%.2f", netSalary());
			
}
}
