package exemplos;

import java.util.Scanner;

public class ExemploJavaMath2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor :");
		int numero01 = sc.nextInt();

		System.out.println("O valor da raíz quadrada é : "+Math.sqrt(numero01));
		sc.close();
	}

}
