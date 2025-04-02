/**
 * 
 * 
 * @author PROPROFISSÃO
 */



package lista02;

import java.util.Scanner;

public class EquacaoQuadratica {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de a da equação quadrática :");
		float numero01=sc.nextFloat();

		System.out.println("Digite o valor de b da equação quadrática :");
		double numero02=sc.nextDouble();
		
		System.out.println("Digite o valor de c da equação quadrática :");
		float numero03=sc.nextFloat();
		
		double delta = Math.pow(numero02, 2.0) - 4*numero01*numero03;
		System.out.println(delta);
	if (delta>0){
		System.out.println("Possui duas raízes");
	}else if (delta == 0) {
		System.out.println("Possui uma raíz");
	}else {
		System.out.println("Não possui raízes");
	}
	
	}

}
