package questao9;

public class Funcionario {

	private String nome;
	private double salario;
	private double bonus;
	private double salarioLiquido;

	public Funcionario() {
	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario <= 1000) {
			bonus = salario * 0.2;
			salarioLiquido = salario + bonus;
			this.salario = salario;
		} else if (salario > 1000 && salario < 2000) {
			bonus = salario * 0.1;
			salarioLiquido = salario + bonus;
			this.salario = salario;
		} else if (salario > 2000) {
			bonus = -salario * 0.1;
			salarioLiquido = salario + bonus;
			this.salario = salario;
		}
	}

	public double getBonus() {
		return bonus;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

}
