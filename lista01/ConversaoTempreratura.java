package lista01;

import java.util.Scanner;

public class ConversaoTempreratura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite a temperatura que deseja converter :");
		float temperaturaCelcius= sc.nextFloat();
		float temperaturaFahrenheit=(temperaturaCelcius*9/5)+32;
		System.out.println("A temperatura em graus Fahrenheit convertida é : "+temperaturaFahrenheit);
	}
}
