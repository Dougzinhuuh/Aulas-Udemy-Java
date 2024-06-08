import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		int quant = sc.nextInt();
		
		Double total = 0.0;
		
		if (cod == 1) {
			total = 4.0 * quant;
		}
		else if (cod == 2){
			total = 4.50 * quant;
		}
		else if (cod == 3) {
			total = 5.0 * quant;
			
		}
		else if (cod == 4) {
			total = 2.0 * quant;
			
		}
		else if (cod == 5) {
			total = 1.50 * quant;
			
		}
		else {
			System.out.println("Operação invalida.");
			
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}
}