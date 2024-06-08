package entities;

public class employee {
	
		private Integer id;
	    private String nome;
	    private Double sal;

	    
	    
	    public employee(Integer id, String nome, Double sal) {
			this.id = id;
			this.nome = nome;
			this.sal = sal;
		}



		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getNome() {
			return nome;
		}



		public void setNome(String nome) {
			this.nome = nome;
		}



		public double getSal() {
			return sal;
		}


		public void getAumento(double perc) {
	         sal = (sal * perc) / 100 + sal;
	    }
		
		
		@Override
		public String toString() {
			return "Employee [id= " + id + ", nome= " + nome + ", sal= " + String.format("%.2f", sal) + "]";
		}
	    
	    
	}


