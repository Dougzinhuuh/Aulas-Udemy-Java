import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double sal = sc.nextDouble();
		
		Double total = 0.0;
		
		if (sal <= 2000.00) {
			total = 0.0;
		}
		else if (sal <= 3000.00){
			total = (sal - 2000.00) * 0.08;
		}
		else if (sal <= 4500.00) {
			total = ((sal - 3000.00) * 0.18) + 80.0; 
			
		}
		else{
			total = ((sal - 4500.00) * 0.28) + 80.0 + 270.0; 
		}
		
		if (total == 0.0) {
			System.out.printf("Isento");
		} else {
			System.out.printf("R$ %.2f%n" , total);
		}
		sc.close();
	}
}