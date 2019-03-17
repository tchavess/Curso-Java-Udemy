package aplication;

import java.util.Locale;
import java.util.Scanner;

import utility.CurrentyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Whats is the Dollar price??" );
		double dollar = sc.nextDouble();
		System.out.print("How many Dollars will be bought?? ");
		double quantity = sc.nextDouble();
	double p = CurrentyConverter.convertTo(dollar, quantity);
		System.out.printf("Amount to the paid in reais: %.2f ", p  );
sc.close();
	}

}
