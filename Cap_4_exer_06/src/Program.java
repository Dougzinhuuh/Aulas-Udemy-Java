import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, pi;
		double AreaT, AreaC, AreaTrap, AreaQ, AreaR;
		
		pi =  3.14159;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		AreaT = A * C / 2;
		AreaC = pi * (C * C);
		AreaTrap = (A + B) * C / 2;
		AreaQ = B * B;
		AreaR = A * B;
		
		System.out.printf("Triangulo: %.3f%n", AreaT);
		System.out.printf("Circulo: %.3f%n", AreaC);
		System.out.printf("Trapezio: %.3f%n", AreaTrap);
		System.out.printf("Quadrado: %.3f%n", AreaQ);
		System.out.printf("Retangulo: %.3f%n", AreaR);
		
		
		sc.close();
	}

}
