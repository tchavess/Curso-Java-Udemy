package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			System.out.println("Product #" + i +" data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().toLowerCase().charAt(0);
			
			switch(ch)
			{
			case 'i':
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Customs Fee: ");
				double fee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, fee));
				
				break;
				
			case 'c':
				System.out.print("Name: ");
				sc.nextLine();
				 name = sc.nextLine();
				System.out.print("Price: ");
				 price = sc.nextDouble();
                list.add(new Product(name, price));
                break;
                
			case 'u':
				System.out.print("Name: ");
				sc.nextLine();
				 name = sc.nextLine();
				System.out.print("Price: ");
				 price = sc.nextDouble();
				 System.out.print("Manufacture date(dd/MM/yyy): ");
				 Date date = sdf.parse(sc.next());
				 
				 list.add(new UsedProduct(name,price,date));
				 
				 break;
				 default:
					 System.out.println("Common, used or imported (c/u/i)? ");
					 i--;
				
			}
			
			
		}
		
		System.out.println("PRICE TAGS: ");
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		
		sc.close();

	}

}
