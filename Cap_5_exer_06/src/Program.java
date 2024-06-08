import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double N = sc.nextDouble();
		
		if (N >= 0 && N <= 25) {
			System.out.println("Intervalo (0,25)");
		}
		else if (N > 25 && N <= 50){
			System.out.println("Intervalo (25,50)");
		}
		else if (N > 50 && N <= 75){
			System.out.println("Intervalo (50,75)");
		}
		else if (N > 75 && N <= 100){
			System.out.println("Intervalo (75,100)");
		}
		else {
			System.out.println("Fora do Intervalo");
			
		}
		sc.close();
	}
}

//double numero = sc.nextDouble();
//
//if (numero < 0.0 || numero > 100.0) {
//	System.out.println("Fora de intervalo");
//}
//else if (numero <= 25.0) {
//	System.out.println("Intervalo [0,25]");
//}
//else if (numero <= 50.0) {
//	System.out.println("Intervalo (25,50]");
//}
//else if (numero <= 75.0) {
//	System.out.println("Intervalo (50,75]");
//}		
//else {
//	System.out.println("Intervalo (75,100]");
//}