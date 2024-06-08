import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double x = 0, y = 0, z = 0, result = 0;
		
		
		for (int i=1; i <= N; i++) {
			
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			
			result = (x * 2 + y * 3 + z * 5)/10;
			System.out.printf("%.1f%n",result);
		}
		sc.close();
	}
}
