package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import program.Employee;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i=0 ; i < n ; i++) {
		System.out.printf("Emplyoee: #%d:",i+1);
		System.out.println();
		
		System.out.print("Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Salary: ");
		double salary = sc.nextDouble();
		
		System.out.println();
		
		list.add(new Employee(id , name , salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int findId = sc.nextInt();
		
		
		Employee emp = list.stream().filter(x -> x.getId() == findId).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This id does not exist!");
		}else
		{
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		for(Employee x: list) {
			System.out.println(x);
		}
 sc.close();
	}

}
