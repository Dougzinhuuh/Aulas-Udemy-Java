package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;
		char yn;
		double depinicial = 0;
		
		System.out.print("Enter account number:");
		int conta = sc.nextInt();
		System.out.print("Enter account holder:");
		String name = sc.next();
		System.out.print("Is there na initial deposit (y/n)? ");
		yn = sc.next().charAt(0);
		System.out.println(yn);
		
		if ( yn == 'n') {
      
			acc	= new Account(conta, name);
		} else {
			System.out.print("Enter initial deposit value: ");
			depinicial = sc.nextDouble();
			System.out.println("");
			acc	= new Account(conta, name, depinicial);
	    }
		
		
		
		System.out.println("Account Data:");
		System.out.println(acc);
		System.out.println("");
		
		double deposit ;
		System.out.print("Enter a deposit value: ");
		deposit = sc.nextDouble();
		acc.deposit(deposit);
		
		System.out.println("Updated account data:");
		System.out.println(acc);
		System.out.println("");
		
		double withdraw;
		System.out.print("Enter a withdraw value: ");
		withdraw = sc.nextDouble();
		acc.withdraw(withdraw);
		
		System.out.println("Updated account data:");
		System.out.println(acc);
		
		sc.close();
		

	}

}
