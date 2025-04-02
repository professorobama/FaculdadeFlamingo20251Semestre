package lista02;

import java.util.Scanner;

public class ConversorMoedas {

	public static void main(String[] args) {
	//Importação de uma Classe
		Scanner sc = new Scanner(System.in);

		System.out.println("Conversor de Moedas");
		//Entrada e saída de Dados
		System.out.println("Digite o valor que você deseja converter :");
		float real =sc.nextFloat();
		System.out.println("Digite o valor do dolar vigente : ");
		float dollar = sc.nextFloat();
		System.out.println("Digite o valor do euro vigente : ");
		float euro = sc.nextFloat();
		System.out.println("Digite o valor da libra vigente : ");
		float libras = sc.nextFloat();
		//Processamento
		float conversorDollar =real/dollar;
		float conversorEuro =real/euro;
		float conversorLibras=real/libras;
		//Saída de Dados
		System.out.printf(" O valor convertido em dollar é  : US$%.2f \n",conversorDollar );
		System.out.printf(" O valor convertido em euro é  : EUR%.2f \n",conversorEuro );
		System.out.printf(" O valor convertido em Libras é  : GBP%.2f \n",conversorLibras );
		sc.close();
		
	}

}
