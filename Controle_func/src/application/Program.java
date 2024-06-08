package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered?");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.println("");
			System.out.println("Employee #"+ i+1 +":");
			
			System.out.print("Id:");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salary:");
			double sal = sc.nextDouble();
			
			
			list.add(new employee(id, nome, sal));
			
		}
		
		System.out.println("");
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		double perc = 0;
		
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			
			
			System.out.print("Enter the percentage: ");
			perc = sc.nextDouble();
			emp.getAumento(perc);
			
			
			
		}
		
		System.out.println("");
		System.out.println("List of employees:");
		
		for (employee x : list) {
			System.out.println(x);
			
			
			}
		
		sc.close();
	}

	private static boolean hasId(List<employee> list, int id) {
		employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
		
	}

}
