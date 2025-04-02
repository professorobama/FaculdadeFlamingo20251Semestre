package exemplos;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Selecione uma opção :");
		System.out.println("1 - Administração");
		System.out.println("2 - Pedagogia :");
		System.out.println("3 - Recursos Humanos");
		System.out.println("4 - Sair :");

		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println(" Parabéns - Você escolheu o curso de Adminstração");
			break;
		case 2:
			System.out.println(" Parabéns - Você escolheu o curso de Pedagogia");
			break;
		case 3:
			System.out.println(" Parabéns - Você escolheu o curso de Recursos Humano");
			break;
		case 4:
			System.out.println(" Parabéns - Você escolheu a opção Sair");
			break;
		default:
			System.out.println("Escolha inválida");
			break;
		}
	}

}
