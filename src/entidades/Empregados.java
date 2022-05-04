package entidades;

public class Empregados {
	
	private int ID;
	private String Nome;
	private double Salario;
	
	public Empregados(int id, String nome, double salario) {
		ID = id;
		Nome = nome;
		Salario = salario;
	}

	public int getID() {
		return ID;
	}
	
	public void setID(String id) {
		Nome = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public double getSalario() {
		return Salario;
	}
	
	public void aumentoSalario(int X) {
		Salario += Salario * X / 100;
	}
	
	public String toString() {
		return ID + ", " 
				+ Nome + ", " 
				+ String.format("%.2f", Salario);
	}

	
	
	
	
	

}
