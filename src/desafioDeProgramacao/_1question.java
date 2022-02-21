package desafioDeProgramacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class _1question {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		List<String> Altura = new ArrayList<>();
		
		System.out.print("Digite o Valor da Base e Altura da Escada:");
		int qtdDegraus = sc.nextInt();
		
		for (int i = 0; i < qtdDegraus; i++) {
			
			Altura.add(" ".repeat((qtdDegraus-1))+ "*".repeat(i+1));
			
				
		}
		
		for (String d: Altura ) {
			System.out.println(d);
		}
		sc.close();
	}
}
