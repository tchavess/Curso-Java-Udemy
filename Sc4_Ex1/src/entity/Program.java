package entity;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account ac;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char d = sc.next().toLowerCase().charAt(0);

		while (d != 'y' && d != 'n') {

			System.out.print("Is there na initial deposit (y/n)? ");
			d = sc.next().toLowerCase().charAt(0);

		}

		if (d == 'y') {

			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			ac = new Account(number, name, deposit);
		} else {
			ac = new Account(number, name);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println("Account: " + ac);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		System.out.println("Updated account data: ");
		ac.deposit(deposit);
		System.out.println("Account: " + ac);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		System.out.println("Updated account data: ");
		ac.withdraw(withdraw);
		System.out.println("Account: " + ac);

		sc.close();
	}

}
