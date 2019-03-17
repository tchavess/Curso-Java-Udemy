package course;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Enter rectangle widght: ");
		rectangle.widght = sc.nextDouble();
		System.out.print("Enter rectangle height: ");
		rectangle.height = sc.nextDouble();
		
		
		
		System.out.println("AREA = "+ String.format("%.2f", rectangle.area()));
		System.out.println("PERIMETER = "+ String.format("%.2f", rectangle.perimeter()));
		System.out.print("DIAGONAL = " + String.format("%.2f", rectangle.diagonal()));
		
		
		sc.close();
	}

}
