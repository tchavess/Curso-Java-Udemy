package entity;

public class Account {
	private int number;
	private String name;
	private double deposit;
	
	public Account() {
	}
	public Account(int number, String name, double initialDeposit) {
		
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}
	
public Account(int number, String name) {
		
		this.number = number;
		this.name = name;
		
	}

public int getNumber() {
	return number;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getDeposit() {
	return deposit;
}
public void deposit(double deposit) {
	this.deposit += deposit;
}

public void withdraw(double deposit) {
	this.deposit -= deposit + 5;
	}
@Override
public String toString() {
	return "" 
           + number 
           + ", Holder: " 
           + name 
           + ", Balance: $ " 
           + String.format("%.2f", deposit) 
           + "";
}


}
