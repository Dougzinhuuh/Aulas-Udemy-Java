import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int in = 0;
		int out = 0;
		
		
		for (int i=1; i <= N; i++) {
			
			int qnt = sc.nextInt();
			if (qnt >= 10 && qnt <= 20) {
				in = in +1;
			} else {
				out = out + 1;
				
			}
			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		
		sc.close();
}
}
