import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int alc = 0, gasol = 0, diesel = 0;
		
		System.out.println("Digite o tipo de combustivel abastecido (4 para encerrar)");
		int n = sc.nextInt();
		
		while (n != 4) {
			
			if (n == 1) {
				alc = alc + 1; 
			} else if (n == 2) {
				gasol = gasol + 1;
			} else if (n == 3) {
				diesel = diesel + 1;
			} else {
				System.out.println("Valor invalido");
			}
			
			
			System.out.println("Digite o tipo de combustivel abastecido (4 para encerrar)");
			n = sc.nextInt();
		}
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: "+ alc);
		System.out.println("Gasolina: "+ gasol);
		System.out.println("Diesel: "+ diesel);
		
		sc.close();
		
	}

}
