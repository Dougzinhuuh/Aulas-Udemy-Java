package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Nome: ");
		emp.Name = sc.next();
		System.out.print("Salario Bruto: ");
		emp.GrossSalary = sc.nextDouble();
		System.out.print("Impostos: ");
		emp.Tax = sc.nextDouble();
		System.out.println(emp);
		

		System.out.print("Digite a porcentagem de aumento: ");
		double percent = sc.nextDouble();
		emp.IncreaseSalary(percent);
		System.out.print(emp);  
		
		
		
		sc.close();
		

	}

}
