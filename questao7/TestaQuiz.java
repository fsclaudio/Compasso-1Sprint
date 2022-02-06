package questao7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestaQuiz {

	public static void main(String[] args) {
		List<String> opcao = new ArrayList<String>();
		opcao.add("Alemanha");
		opcao.add("Argentina");
		opcao.add("Italia");
		opcao.add("Brasil");
		opcao.add("França");
		opcao.add("Espanha");
		opcao.add("Portugal");
		ArrayList<Quiz> perguntas = new ArrayList<Quiz>();

		perguntas.add(new Quiz("Campeão da copa de 1974", "Alemanha"));
		perguntas.add(new Quiz("Campeão da copa de 1978", "Argentina"));
		perguntas.add(new Quiz("Campeão da copa de 1982", "Italia"));
		perguntas.add(new Quiz("Campeão da copa de 1986", "Argentina"));
		perguntas.add(new Quiz("Campeão da copa de 1990", "Alemanha"));
		perguntas.add(new Quiz("Campeão da copa de 1994", "Brasil"));
		var pergunta = 1;
		var I = 0;
		var acerto = 0;
		var erro = 0;

		System.out.println("Qual o Seu nome?");
		Scanner s = new Scanner(System.in);
		String nome = s.nextLine();

		System.out.println(nome + " ======== Perguntas Sobre os campeões de copa por ano ========");
		while (I < perguntas.size()) {
			for (int j = 0; j < perguntas.size(); j++) {
				Collections.shuffle(opcao); 
				System.out.println("Pergunta numero " + pergunta);
				System.out.println(perguntas.get(I).getPergunta() + " escolha uma opcao de " + 1 + " a " + opcao.size());

				for (int r = 0; r < opcao.size(); r++) {
					int op = r + 1;
					System.out.println(op + ") " + opcao.get(r));
				}
				int numero = s.nextInt();
				;
				if (perguntas.get(I).getResposta() == opcao.get(numero - 1).toString()) {
					acerto++;
				} else {
					erro++;
				}

				pergunta++;
				I++;
			}
		}
		clearScreen();
		System.out.println("===================================");
		System.out.println("Nome: " + nome);
		System.out.println("Acertos: " + acerto);
		System.out.println("Erros: " + erro);
		System.out.println("===========Fim do Quiz=============");
		s.close();
	}
	public static void clearScreen() {  
		 for (int i = 0; i < 100; ++i)  
		       System.out.println();  
	} 
	
}
