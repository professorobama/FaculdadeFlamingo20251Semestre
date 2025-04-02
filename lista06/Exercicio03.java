package lista06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Sistema de Calculadora");
		System.out.println("Digite  o primeiro valor :");
		int numero01 = sc.nextInt();
		System.out.println("Digite  o segundo valor :");
		int numero02 = sc.nextInt();
		System.out.println("Digite  a operação que deseja efetuar :");
		char operacao = sc.next().charAt(0);
		float resultado;
		switch (operacao) {
		case '+':
			resultado = numero01 + numero02;
			System.out.println("O resultado da soma é : " + resultado);
			break;
		case '-':
			resultado = numero01 - numero02;
			System.out.println("O resultado da subtração é : " + resultado);
			break;
		case '*':
			resultado = numero01 * numero02;
			System.out.println("O resultado da multiplicação é : " + resultado);
			break;
		case '/':
			resultado = numero01 / numero02;
			System.out.println("O resultado da divisão é : " + resultado);
			break;
		default:
			System.out.println("Operação não realizada! - Caracter inválido");
			break;
		}
		sc.close();
	}

}
