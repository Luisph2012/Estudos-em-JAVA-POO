package Empresa;

public class Empregado extends Pessoa{
	
	private double Salario;
	public String Matricula;
	
	public double valorInss() {
        return this.Salario * 0.11;
    }
	
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}	

}
