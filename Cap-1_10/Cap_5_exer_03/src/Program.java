import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N1 = sc.nextInt();
	    
		int N2 = sc.nextInt();
		
		if (N1 % N2 == 0 || N2 % N1 == 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}

		sc.close();
	}
}