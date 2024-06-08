package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double Mvalor = 0.0;
		double[] Vect = new double[n];
		
		
		System.out.println("");
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			Vect[i] = sc.nextDouble();
			Mvalor += Vect[i];
		}
		
		Mvalor = Mvalor / Vect.length;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f\n", Mvalor);
		System.out.print("ELEMENTOS ABAIXO DA MEDIA: \n");
		for (int i=0; i<n; i++) {
			if (Vect[i] < Mvalor) {
				System.out.println(Vect[i]);
				
			}
		}
		
		sc.close();
		}
		

}



