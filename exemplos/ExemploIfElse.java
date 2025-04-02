package exemplos;
import java.util.Scanner;
public class ExemploIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade, para saber se pode votar:");
		int idade = sc.nextInt();
		
		if (idade<16) {
			System.out.println("Você não pode votar");
			
		} else if (idade<18){
			System.out.println("Você pode votar, mas não é obrigatorio");
		} else {
			System.out.println("Você é obrigado a votar ");
		}
		
	}

}
