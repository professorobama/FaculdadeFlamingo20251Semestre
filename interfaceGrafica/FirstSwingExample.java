//Declaração do pacote
package interfaceGrafica;

// Trazer uma Classe ou conjunto de classes
import javax.swing.*;

//Declaração de uma Classe
public class FirstSwingExample {

	// Declaração de um métod de uma ação

	public static void main(String[] args) {
		//Criação do objeto para inserir uma interface gráfica
		JFrame quadro = new JFrame("Calculadora Flamingo");

		//Criação de um botão que possua interface gráfica
		JButton botao = new JButton("Clique Aqui");
		// x axis, y axis, width, height
		botao.setBounds(130, 100, 100, 40);
		//Adicionando um botão ao Frame
		quadro.add(botao);
		// 400 width and 500 height
		quadro.setSize(350, 350);
		// Sem utilizar o gerenciamento de Layout
		quadro.setLayout(null);
		// Torna o quadro visivel
		quadro.setVisible(true);
	}
}
