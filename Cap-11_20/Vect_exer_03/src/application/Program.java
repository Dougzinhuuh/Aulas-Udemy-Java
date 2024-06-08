package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados da "+ (i+1) +"a pessoa:  ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			
		}
		
		double almedia;
		System.out.println("");
		double soma = 0.0;		
		for (int i=0; i<n; i++) {
			soma += altura[i];
				
			}
		
		double menoridade = 0.0;		
		for (int i=0; i<n; i++) {
			
			if (idade[i] < 16) {
				menoridade += 1;
				
			}
				
		}
		
		menoridade = (menoridade * 100) / idade.length  ;
		almedia = 0.0;	
		almedia = soma / altura.length;
		
		System.out.printf("Altura média: %.2f%n" , almedia);
		System.out.printf("\nPessoas com menos de 16 anos: %.1f%n" , menoridade);
		
		for (int i=0; i<n; i++) {
			
			if (idade[i] < 16) {
				System.out.println(nome[i]);
				
			}
		
		sc.close();
		}
		
		
		

}
}


