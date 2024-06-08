package entities;

public class Student {
	
	public String Name;
	public double N1, N2, N3;
	
	public double NotaF() {
		return N1 + N2 + N3;
	}
	
	public double fail() {
		return 60 - NotaF();
	}
	
	public String toString() {
		return "Estudante: " +  Name + " Nota final: " + String.format("%.2f", NotaF());
	

}
}
