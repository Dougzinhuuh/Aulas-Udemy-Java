package entities;

public class Account {
	
	private int conta;
	private String name;
	private double saldo;
	
	
	
	public Account(int conta, String name) {
		this.conta = conta;
		this.name = name;
	}
	public Account(int conta, String name, double depinicial) {
		this.conta = conta;
		this.name = name;
		deposit(depinicial);
	}
	public int getConta() {
		return conta;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSaldo() {
		return saldo;
	}
	public void deposit(double deposit) {
		 saldo += deposit;
	}
	
	public void withdraw(double withdraw) {
		 saldo = saldo - withdraw - 5;
	}
	
	
	public String toString() {
		return "Account: " +  conta + ", Holder: " + name + ", Balance: $ " + saldo;
	}

}
	
