package lista01;

import java.util.Scanner;

public class RestoDaDivisao {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero para dividir:");
		
		float valor01 = sc.nextFloat();
		
		System.out.println("Digite o numero para dividir:");
		
		float valor02 = sc.nextFloat();
		
		float resultado = valor01%valor02;
		
		System.out.printf("O valor da divisão é : %.2f",resultado);
		sc.close();

	}

}
