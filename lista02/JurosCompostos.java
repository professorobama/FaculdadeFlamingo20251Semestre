package lista02;

import java.util.Scanner;

public class JurosCompostos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Digite o valor do capital inicial
		System.out.println("Digite o valor do capital inicial: ");
		double capitalInicial= sc.nextDouble();
		//Digite o valor dos juros anuais
		System.out.println("Digite o valor do juros anuais: ");
		double jurosAnuais= sc.nextDouble();    
		//Digite a quantidade de anos que deve ser aplicado a grana
		System.out.println("Digite o número de anos: ");
		int numeroAnos = sc.nextInt();
		
		double valorFinal =capitalInicial*Math.pow(1+jurosAnuais/100,numeroAnos);
		System.out.printf("O valor final é : %.2f",valorFinal);
		
		sc.close();

	}

}
