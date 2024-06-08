import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = 1;
		
		for (int i=1; i <= N; i++) {
			
			result = result * i;
		}
		System.out.println("------------");
		System.out.println(result);
		sc.close();
	}

}
 