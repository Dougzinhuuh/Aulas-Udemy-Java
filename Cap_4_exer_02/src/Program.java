import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		System.out.println("Digite o raio do circulo:");
		double raio = sc.nextDouble();
		
		double resultado = pi * (raio * raio);
		
		System.out.printf("A área do circulo é: %.4f", resultado);
		
		sc.close();

	}

}
