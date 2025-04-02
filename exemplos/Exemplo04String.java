package exemplos;

public class Exemplo04String {

	public static void main(String[] args) {
		String texto = "Jailson Costa dos Santos";
		System.out.println("Para chegar até a palavra Costa são : "+texto.indexOf("Costa") + " caracteres.");
		System.out.println("Para chegar até a palavra Santos são : "+texto.indexOf("Santos") + " caracteres.");
		System.out.println(texto.trim());
		
	}
}
