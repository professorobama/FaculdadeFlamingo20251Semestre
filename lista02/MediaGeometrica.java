package lista02;

import java.util.Scanner;

public class MediaGeometrica {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o 1º número : "); 
			double numero01 = sc. nextDouble();
			
			System.out.println("Digite o 2º número  : ");
			double numero02 = sc. nextDouble();
			
			System.out.println("Digite o 3º número : ");
			double numero03 = sc. nextDouble();
			
			 double mediaGeometrica = Math.cbrt(numero01*numero02*numero03);
					 
			 System.out.println("A média Geometrica dos números digitados é : "+ mediaGeometrica);
		}

	}
