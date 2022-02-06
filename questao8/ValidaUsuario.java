package questao8;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ValidaUsuario {

	public static void main(String[] args) {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("roberto", "123"));
		usuarios.add(new Usuario("teste", "teste123"));

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o Usuario");
		String userName = sc.nextLine();
		System.out.println("Entre com a Senha");

		String userPassword = sc.nextLine();

		for (int i = 0; i < usuarios.size(); i++) {
			if ((usuarios.get(i).getUsario().equals(userName)) && (usuarios.get(i).getSenha().equals(userPassword))) {
				exibeMesangem();
				System.out.print(" Voce logo ao nosso sistema");
				break;
			} else {
				System.out.println("Usuario e/ou Senha incorretos!");
				break;
			}
		}
	}

	public static void exibeMesangem() {
		LocalTime presentTime = LocalTime.now();
		if (presentTime.getHour() <= 5) {
			System.out.println("Boa Madrugada!");
		} else if (presentTime.getHour() < 12) {
			System.out.println("Bom dia!");
		} else if (presentTime.getHour() < 18) {
			System.out.println("Boa Tarde!");
		} else {
			System.out.println("Boa Noite!");
		}
	}

}
