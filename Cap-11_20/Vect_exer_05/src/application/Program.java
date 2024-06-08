package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero:  ");
			vect[i] = sc.nextDouble();
		}
		
		double Mvalor = vect[0];
		int position = 0;
		for (int i=0; i<n; i++) {
			if (Mvalor < vect[i]) {
				Mvalor = vect[i];
				position = i;
			}
				
		}
		
		System.out.printf("\nMAIOR VALOR = %.2f%n", Mvalor);
		System.out.print("POSICAO DO MAIOR VALOR = "+ position);
		
		sc.close();
		}
		
		
		

}



