package exemplos;
import java.util.Scanner;
public class ExemploMath03 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		float numero1 = sc.nextFloat();
		System.out.println("O valor positivo do número digitado é: " + Math.abs(numero1));
		
	}
	
}
