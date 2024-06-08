package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double Mvalor = 0;
		int contador = 0;
		int index = 0;
		int[] Vect = new int[n];
		
		System.out.println("");
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			Vect[i] = sc.nextInt();
			
			
		}
		
		for (int i=0; i<n; i++) {
			if (Vect[i] % 2 == 0) {
				contador += Vect[i];
				index++;
			} 
		}
		
		if (contador == 0) {
			System.out.print("\nNENHUM NUMERO PAR ");
		} else {
			Mvalor = (double)contador / index;
			System.out.printf("\nMEDIA DOS PARES = %.1f", Mvalor);
		}
		
		sc.close();
		}
		

}



