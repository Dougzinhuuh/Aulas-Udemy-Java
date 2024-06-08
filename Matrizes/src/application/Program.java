package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		
		System.out.print("Digite o numero de Linhas da Matriz:");
		int M = sc.nextInt();
		System.out.print("Digite o numero de Colunas da Matriz:");
		int N = sc.nextInt();
		Integer [][] Mat = new Integer [M] [N];
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {

				Mat [i][j] = sc.nextInt();
				
			}	
		}
		
		System.out.print("Digite o Valor que deseja pesquisar: ");
		x = sc.nextInt();
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				if (x == Mat [i][j]) {
					System.out.println("Position " + i + "," + j);
					if (j > 0) {
						System.out.println("Left: " + Mat [i][j-1]);
					}
					if (j < Mat[i].length - 1) {
					System.out.println("Right: " + Mat [i][j+1]);
					}
					if (i < Mat.length - 1) {
					System.out.println("Down: " + Mat [i+1][j]);
					}
					if (i > 0) {
					System.out.println("Up: " + Mat [i-1][j]);
					}
				}
				
			}	
		}
		
		
		
		
		
		
		sc.close();
	}

	

}
