package questao9;
import java.util.ArrayList;
import java.util.Scanner;

public class TesteFunc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalfuncionarios = 0;
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

		System.out.println("Digite a quantidade de funcionarios");
		totalfuncionarios = sc.nextInt();

		for (int i = 0; i < totalfuncionarios; i++) {
			sc.nextLine();
			System.out.println("Digite o nome do fucionario " + (i + 1));
			String nome = sc.nextLine();
			System.out.println("Digite o salario do fucionario " + (i + 1));
			double salario = sc.nextDouble();
			Funcionario func =new Funcionario();
			func.setNome(nome);
			func.setSalario(salario);
			funcionarios.add(func);
		}
		clearScreen();

		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).getBonus() < 0) {
				System.out.printf("Funcionário %s %nSalário: %.2f %nDesconto: %.2f %nSalário Liquido: %.2f%n",
						funcionarios.get(i).getNome(), funcionarios.get(i).getSalario(), funcionarios.get(i).getBonus(),
						funcionarios.get(i).getSalarioLiquido());
				System.out.println("=========================");
			} else {
				System.out.printf("Funcionário %s %nSalário: %.2f %nBonus: %.2f %nSalário Liquido: %.2f%n",
						funcionarios.get(i).getNome(), funcionarios.get(i).getSalario(), funcionarios.get(i).getBonus(),
						funcionarios.get(i).getSalarioLiquido());
				System.out.println("=========================");
			}
		}
		sc.close();
		System.out.println("==========FIM============");
	}
	public static void clearScreen() {  
		 for (int i = 0; i < 100; ++i)  
		       System.out.println();  
	}  
}
