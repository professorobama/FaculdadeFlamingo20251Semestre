package lista01;

import java.util.Scanner;

public class Media {
public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor da primeira nota :");
	float nota01  = sc.nextFloat();
	System.out.println("Digite o valor da segunda nota :");
	float nota02  = sc.nextFloat();
	System.out.println("Digite o valor da terceira nota :");
	float nota03  = sc.nextFloat();
	float somatoria =nota01+nota02+nota03;
	float media = somatoria/3;
	System.out.println("O valor da média é  : " +media);
	sc.close();
}
}
