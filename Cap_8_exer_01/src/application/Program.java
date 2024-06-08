package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle ret = new Rectangle();
		System.out.println("Digite as informações do retangulo.");
		System.out.print("Largura: ");
		ret.Width = sc.nextDouble();
		System.out.print("Altura: ");
		ret.Height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", ret.Area());
		System.out.printf("PERIMETER = %.2f%n", ret.Perimeter());
		System.out.printf("DIAGONAL = %.2f%n", ret.Diagonal());
		
		
		
		sc.close();

	}

}
