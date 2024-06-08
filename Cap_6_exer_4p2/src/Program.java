import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
	
		
		for (int i=1; i <= N; i++) {
			
			double x = sc.nextInt();
			double y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("Divisão impossivel");
			} else {
				System.out.printf("%.1f%n",x / y);
			}
			
		}
		
		sc.close();
	}
}
