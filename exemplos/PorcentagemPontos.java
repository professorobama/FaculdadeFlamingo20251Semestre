package exemplos;

public class PorcentagemPontos {

	public static void main(String[] args) {
		int pontuacaoMaxima =500;
		
		int pontuacaoAtual = 423;
		
		float porcentagemPontuacao = (float) pontuacaoAtual/pontuacaoMaxima * 100.00f;
		
		System.out.println("A pontuação atual em porcentagem é : "+porcentagemPontuacao+ "%");
	}

}
