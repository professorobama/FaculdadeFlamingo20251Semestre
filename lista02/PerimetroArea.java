package lista02;

import java.util.Scanner;

public class PerimetroArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1º lado do triângulo : ");
		float lado01 = sc. nextFloat();
		System.out.println("Digite o 2º lado do triângulo : ");
		float lado02 = sc. nextFloat();
		System.out.println("Digite o 3º lado do triângulo : ");
		float lado03 = sc. nextFloat();
		float perimetro = lado01+lado02+lado03;
		System.out.println("Digite o valor da base do triângulo : ");
		float base = sc. nextFloat();
		System.out.println("Digite o valor da altura do triângulo : ");
		float altura = sc. nextFloat();
		float area =base*altura/2;
		System.out.println("O valor do perimetro é : "+perimetro);
		System.out.println("O valor do area é : "+area);
		sc.close();
	}

}
