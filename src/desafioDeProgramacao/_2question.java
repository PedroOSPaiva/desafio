package desafioDeProgramacao;

import java.util.Scanner;

public class _2question {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Login: ");
		String login = in.nextLine();
		
		System.out.println("Senha: ");
		String senha = in.nextLine();
		
		
		
		if (login.equals("Pedro") && senha.equals("S3N@!P3dr@1")) {
			System.out.printf("Usuário %s logado com sucesso.", login);
		}
		else {
			System.out.println("Login ou senha inválidos!");
		}
		in.close();
	}

}
