package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		
		for (int i=0; i<n; i++) {
			
			String name = null;
			String email = null;
			int room = 0; 
			System.out.println("Rent #"+ (i+1) +": ");
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			System.out.println("");
			
			Rent rent = new Rent (name, email);
			vect[room] = rent;
			
			// vect[room] = new Rent (name, email); outra forma da mesma coisa
		}
		
		System.out.println("Busy rooms: ");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
			
		}
		
		sc.close();
		}
		

}



