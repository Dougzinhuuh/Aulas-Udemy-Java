import java.util.Locale;
import java.util.Scanner;

public class Program {

	
	public static void main(String[] args) {
		
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua senha:");
		int n = sc.nextInt();
		
		do {
			System.out.println("Senha invalida.");
			n = sc.nextInt();
		} while (n != 2002) ;
			System.out.println("Acesso permitido");
		
		sc.close();
	}
}
