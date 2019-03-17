package application;

import java.util.ArrayList;
import java.util.List;

public class testapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Joao");
		list.add("Ivã");
		list.add("Jenifer");
		list.add("Nicolas");

		for(String x: list ) {
			System.out.println(x);
			
		}
		System.out.println("------------------------------------------");
		System.out.println(list.size());
		list.add(3,"Jane");
		list.remove("Nicolas");
		for(String x: list ) {
			System.out.println(x);
			
		}
		
		
		
	}

}
