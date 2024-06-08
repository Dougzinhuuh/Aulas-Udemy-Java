package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		String[] name = new String[10];
		String[] mail = new String[10];
		int[] predio = new int[10];
			
		
		for (int i=0; i<n; i++) {
			
			String nome = null;
			String email = null;
			int room = 0; 
			System.out.println("Rent #"+ (i+1) +": ");
			System.out.print("Name: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			System.out.println("");
			
			name[room] = nome;
			mail[room] = email;
			predio[room] = room ;
		}
		
		System.out.println("Busy rooms: ");
		for (int i=0; i<10; i++) {
			if (name[i] != null) {
				System.out.println(predio[i] + ": " + name[i] +", " + mail[i]);
			}
			
		}
		
		sc.close();
		}
		

}



