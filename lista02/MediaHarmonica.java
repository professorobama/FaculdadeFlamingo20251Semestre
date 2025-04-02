package lista02;

import java.util.Scanner;

public class MediaHarmonica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1º número : "); 
		float numero01 = sc. nextFloat();
		
		System.out.println("Digite o 2º número  : ");
		float numero02 = sc. nextFloat();
		
		System.out.println("Digite o 3º número : ");
		float numero03 = sc. nextFloat();
		
		 float mediaHarmonica = 3 / ( (1/numero01) + (1/numero02) + (1/numero03));
				 
		 System.out.println("A média harmônica dos números digitados é : "+ mediaHarmonica);
	}

}
