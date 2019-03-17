package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		Cadastro[] vect = new Cadastro[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i= 0; i < n ; i++) {
			System.out.printf("Rent #%d:",i+1);
			System.out.println();
			System.out.print("Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			//sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
		}
		System.out.println("Busy Rooms");
		

	}

}
