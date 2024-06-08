package entities;

public class Employee {
	
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public void IncreaseSalary(double percent) {
		 GrossSalary += (GrossSalary * percent /100 ) ;
	}
	
	public String toString() {
		return "Funcionario: " +  Name + ", $ " + String.format("%.2f", NetSalary());

	}

}
