package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		String nom = null;
		int Midade = 0;
		
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados da "+ (i+1) +"a pessoa:  ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
		}
		
		for (int i=0; i<n; i++) {
			if (Midade < idade[i]) {
				Midade = idade[i];
				nom = nome[i];
			}
			
		}
		
		System.out.printf("\nPESSOA MAIS VELHA: " + nom);
		
		
		sc.close();
		}
		

}



