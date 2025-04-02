package exemplos;

import java.util.Scanner;

public class Exemplo01Cadastro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu nome :");
		String nome = sc.nextLine();
		System.out.println("Digite o seu sobrenome :");
		String sobrenome = sc.nextLine();
		System.out.println("Digite a sua idade :");
		int idade = sc.nextInt();
		System.out.println("Digite o seu período de estudo :");
		String periodo = sc.nextLine();
		sc.nextLine();
		System.out.println("Digite a turma que está matriculado :");
		String turma = sc.nextLine();
		System.out.println("Digite o seu CPF :");
		String cpf = sc.nextLine();
		System.out.println("Digite o seu logradouro :");
		String logradouro = sc.nextLine();
		System.out.println("Digite o seu CEP :");
		String cep = sc.nextLine();
		System.out.println("Digite o seu telefone sem DDD :");
		String telefone = sc.nextLine();
		System.out.println("Digite o número do seu RG :");
		String rg = sc.nextLine();
		
		System.out.println(" O nome do aluno(a) é : " +nome);
		System.out.println(" O sobrenome do aluno(a) é : " +sobrenome);
		System.out.println(" A idade do aluno é : " +idade);
		System.out.println(" O aluno estuda no período escolar : " +periodo);
		System.out.println(" O aluno estuda na turma : " +turma);
		System.out.println(" O número do CPF do aluno(a) : " +cpf);
		System.out.println(" O nome do logradouro do aluno(a) é : " +logradouro);
		System.out.println(" O número do CEP do aluno(a) é : " +cep);
		System.out.println(" O número do telefone do aluno sem DDD é : " +telefone);
		System.out.println(" O número do RG do aluno(a) é : " +rg);
		
		sc.close();
		
	}

}
