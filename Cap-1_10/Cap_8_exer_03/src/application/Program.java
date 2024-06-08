package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;



public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student Stud = new Student();
		
		System.out.print("Nome: ");
		Stud.Name = sc.next();
		
		System.out.print("Nota 1: ");
		Stud.N1 = sc.nextDouble();
		if (Stud.N1 > 30 || Stud.N1 < 0) {
			System.out.println("Nota invalida");
			System.out.print("Nota 1: ");
			Stud.N1 = sc.nextDouble();
		}
		
		System.out.print("Nota 2: ");
		Stud.N2 = sc.nextDouble();
		if (Stud.N2 > 35 || Stud.N2 < 0) {
			System.out.println("Nota invalida");
			System.out.print("Nota 2: ");
			Stud.N2 = sc.nextDouble();
		}
		
		System.out.print("Nota 3: ");
		Stud.N3 = sc.nextDouble();
		if (Stud.N3 > 35 || Stud.N3 < 0) {
			System.out.println("Nota invalida");
			System.out.print("Nota 3: ");
			Stud.N3 = sc.nextDouble();
		}
		
		
		if (Stud.NotaF() >= 60) {
			
			System.out.println(Stud);
			System.out.println("Você passou.");
			
		} else {
			
			System.out.println(Stud);
			System.out.println("Você reprovou");
			System.out.println("Faltaram " + Stud.fail() + " Pontos");
		}
		
		
		
		
		
		sc.close();

	}

}
