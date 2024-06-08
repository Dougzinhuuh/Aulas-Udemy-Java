import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numf , horaf;
		double valorf, sal;
		
		numf = sc.nextInt();
		horaf = sc.nextInt();
		valorf = sc.nextDouble();
		
		System.out.println("NUMBER = " + numf);
		sal = horaf * valorf;
		System.out.printf("SALARY =  U$ %.2f%n" , sal);
		
		
		sc.close();
	}

}
