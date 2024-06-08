package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] sexo = new String[n];
		double[] altura = new double[n];
		
		double media = 0.0;
		double menorA;
		double maiorA;
		int homens = 0;
		int cont = 0;
		
		
		
		for (int i=0; i<n; i++) {
			
			System.out.print("Altura da "+ (i+1) +"a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da "+ (i+1) +"a pessoa: ");
			sc.nextLine();
			sexo[i] = sc.nextLine();
			
			
			
		}
		
		menorA = altura[0];
		maiorA = altura[0];
		
		for (int i=0; i<n; i++) {
			
			if (altura[i] < menorA) {
				menorA = altura[i];
			}
			
			if (maiorA < altura[i]) {
				maiorA = altura[i];
			}
			
			if (sexo[i].equals("M") ) {
				homens += 1;
			}
			
			if (sexo[i].equals("F")) {
				media += altura[i];
				cont += 1;
			}
			
		}
		
		media = media / cont;
		System.out.printf("Menor altura = " + menorA);
		System.out.printf("\nMaior altura = " + maiorA);
		System.out.printf("\nMedia das alturas das mulheres = %.2f", media);
		System.out.printf("\nNumero de homens = " + homens);
		
		
		sc.close();
		}
		

}



