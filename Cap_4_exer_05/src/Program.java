import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pcod1, pquant1, pcod2, pquant2;
		double val1, val2, result;
		
		pcod1 = sc.nextInt();
		pquant1 = sc.nextInt();
		val1 = sc.nextDouble();
		
		pcod2 = sc.nextInt();
		pquant2 = sc.nextInt();
		val2 = sc.nextDouble();
		
		result = (pquant1 * val1) + (pquant2 * val2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", result);
		
		sc.close();
	}

}
